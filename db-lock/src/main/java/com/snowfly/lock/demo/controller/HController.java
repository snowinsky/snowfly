package com.snowfly.lock.demo.controller;

import com.snowfly.lock.demo.mapper.TVendorTrxBatchDao;
import com.snowfly.lock.demo.model.TVendorTrxBatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@RestController
public class HController {

    @Autowired
    private TVendorTrxBatchDao tVendorTrxBatchDao;

    @GetMapping(value = "/hello")
    public void hello() throws InterruptedException {
        /*TVendorTrxBatch tVendorTrxBatch = new TVendorTrxBatch();
        tVendorTrxBatch.setId(new BigDecimal("1"));
        tVendorTrxBatch.setTransType((short)0);
        tVendorTrxBatch.setChannelCode("12");
        tVendorTrxBatch.setBatchName("12");
        tVendorTrxBatch.setRequestTotalNum(new BigDecimal("1"));
        tVendorTrxBatch.setActualTotalNum(new BigDecimal("1"));
        tVendorTrxBatch.setProcessStatus((short)2);
        tVendorTrxBatch.setCdate(LocalDateTime.now());
        tVendorTrxBatch.setEdate(LocalDateTime.now());
        tVendorTrxBatch.setCreator("11");
        tVendorTrxBatch.setEditor("11");
        tVendorTrxBatch.setStatus("a");

        tVendorTrxBatchDao.insert(tVendorTrxBatch);*/
        TVendorTrxBatch batch = tVendorTrxBatchDao.selectByPrimaryKey(new BigDecimal("1"));
        LocalDateTime timestamp = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        if(lock(batch, timestamp)){
            Thread.sleep(3000);
            unlock(batch, timestamp);
        }

    }

    private void unlock(TVendorTrxBatch batch, LocalDateTime timestamp) {
        int updateCount = tVendorTrxBatchDao.updateStatusComplete(batch.getBatchName(), timestamp);
        if(updateCount != 1){
            throw new IllegalStateException("The status cannot be changed to complete");
        }
    }

    /**
     * 使用的是数据库中的日期字段作为排他性check。属于乐观锁的实现。
     * 首先，查询出结果，筛选出需要处理的数据集备选。
     * 其次，已查询时的时间戳作为检查条件，保证该时间戳在更新时无变化。如果有变化，则表示该数据已被变更，则更新失败，后边的处理当立即停止。
     * 最后，更新状态的同时，将时间戳更新为参数提供的时间戳。而这个时间戳，会作为解锁时的查询条件。如果解锁时无法正常更新该条信息，则解锁失败。
     * @param batch
     * @param timestamp
     * @return
     */
    private boolean lock(TVendorTrxBatch batch, LocalDateTime timestamp) {
        int updateCount = tVendorTrxBatchDao.updateStatusInProcess(batch.getBatchName(), batch.getEdate(), timestamp);
        return updateCount == 1;
    }
}
