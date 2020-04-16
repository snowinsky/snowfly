package com.snowfly.lock.demo.mapper;

import com.snowfly.lock.demo.model.TVendorTrxBatch;
import com.snowfly.lock.demo.model.TVendorTrxBatchExample;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TVendorTrxBatchDao {
    long countByExample(TVendorTrxBatchExample example);

    int deleteByExample(TVendorTrxBatchExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(TVendorTrxBatch record);

    int insertSelective(TVendorTrxBatch record);

    List<TVendorTrxBatch> selectByExample(TVendorTrxBatchExample example);

    TVendorTrxBatch selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") TVendorTrxBatch record, @Param("example") TVendorTrxBatchExample example);

    int updateByExample(@Param("record") TVendorTrxBatch record, @Param("example") TVendorTrxBatchExample example);

    int updateByPrimaryKeySelective(TVendorTrxBatch record);

    int updateByPrimaryKey(TVendorTrxBatch record);

    int updateStatusInProcess(@Param("batchName") String batchName, @Param("edate") LocalDateTime edate, @Param("timestamp") LocalDateTime timestamp);

    int updateStatusComplete(@Param("batchName") String batchName, @Param("timestamp") LocalDateTime timestamp);
}