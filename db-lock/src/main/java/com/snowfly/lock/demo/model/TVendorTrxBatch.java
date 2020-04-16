package com.snowfly.lock.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;

/**
 * T_VENDOR_TRX_BATCH
 * @author 
 */
@Data
public class TVendorTrxBatch implements Serializable {
    private BigDecimal id;

    private Short transType;

    private String channelCode;

    private String batchName;

    private BigDecimal requestTotalNum;

    private BigDecimal actualTotalNum;

    private Short processStatus;

    private LocalDateTime cdate;

    private LocalDateTime edate;

    private String creator;

    private String editor;

    private String status;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TVendorTrxBatch other = (TVendorTrxBatch) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTransType() == null ? other.getTransType() == null : this.getTransType().equals(other.getTransType()))
            && (this.getChannelCode() == null ? other.getChannelCode() == null : this.getChannelCode().equals(other.getChannelCode()))
            && (this.getBatchName() == null ? other.getBatchName() == null : this.getBatchName().equals(other.getBatchName()))
            && (this.getRequestTotalNum() == null ? other.getRequestTotalNum() == null : this.getRequestTotalNum().equals(other.getRequestTotalNum()))
            && (this.getActualTotalNum() == null ? other.getActualTotalNum() == null : this.getActualTotalNum().equals(other.getActualTotalNum()))
            && (this.getProcessStatus() == null ? other.getProcessStatus() == null : this.getProcessStatus().equals(other.getProcessStatus()))
            && (this.getCdate() == null ? other.getCdate() == null : this.getCdate().equals(other.getCdate()))
            && (this.getEdate() == null ? other.getEdate() == null : this.getEdate().equals(other.getEdate()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTransType() == null) ? 0 : getTransType().hashCode());
        result = prime * result + ((getChannelCode() == null) ? 0 : getChannelCode().hashCode());
        result = prime * result + ((getBatchName() == null) ? 0 : getBatchName().hashCode());
        result = prime * result + ((getRequestTotalNum() == null) ? 0 : getRequestTotalNum().hashCode());
        result = prime * result + ((getActualTotalNum() == null) ? 0 : getActualTotalNum().hashCode());
        result = prime * result + ((getProcessStatus() == null) ? 0 : getProcessStatus().hashCode());
        result = prime * result + ((getCdate() == null) ? 0 : getCdate().hashCode());
        result = prime * result + ((getEdate() == null) ? 0 : getEdate().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", transType=").append(transType);
        sb.append(", channelCode=").append(channelCode);
        sb.append(", batchName=").append(batchName);
        sb.append(", requestTotalNum=").append(requestTotalNum);
        sb.append(", actualTotalNum=").append(actualTotalNum);
        sb.append(", processStatus=").append(processStatus);
        sb.append(", cdate=").append(cdate);
        sb.append(", edate=").append(edate);
        sb.append(", creator=").append(creator);
        sb.append(", editor=").append(editor);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}