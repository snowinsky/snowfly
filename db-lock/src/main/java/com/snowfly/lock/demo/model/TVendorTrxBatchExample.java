package com.snowfly.lock.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVendorTrxBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVendorTrxBatchExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(Short value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(Short value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(Short value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(Short value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(Short value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<Short> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<Short> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(Short value1, Short value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(Short value1, Short value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("CHANNEL_CODE =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_CODE <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("CHANNEL_CODE >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("CHANNEL_CODE <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("CHANNEL_CODE like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("CHANNEL_CODE not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("CHANNEL_CODE in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_CODE not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNull() {
            addCriterion("BATCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBatchNameIsNotNull() {
            addCriterion("BATCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNameEqualTo(String value) {
            addCriterion("BATCH_NAME =", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotEqualTo(String value) {
            addCriterion("BATCH_NAME <>", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThan(String value) {
            addCriterion("BATCH_NAME >", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_NAME >=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThan(String value) {
            addCriterion("BATCH_NAME <", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLessThanOrEqualTo(String value) {
            addCriterion("BATCH_NAME <=", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameLike(String value) {
            addCriterion("BATCH_NAME like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotLike(String value) {
            addCriterion("BATCH_NAME not like", value, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameIn(List<String> values) {
            addCriterion("BATCH_NAME in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotIn(List<String> values) {
            addCriterion("BATCH_NAME not in", values, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameBetween(String value1, String value2) {
            addCriterion("BATCH_NAME between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andBatchNameNotBetween(String value1, String value2) {
            addCriterion("BATCH_NAME not between", value1, value2, "batchName");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumIsNull() {
            addCriterion("REQUEST_TOTAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumIsNotNull() {
            addCriterion("REQUEST_TOTAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumEqualTo(BigDecimal value) {
            addCriterion("REQUEST_TOTAL_NUM =", value, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumNotEqualTo(BigDecimal value) {
            addCriterion("REQUEST_TOTAL_NUM <>", value, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumGreaterThan(BigDecimal value) {
            addCriterion("REQUEST_TOTAL_NUM >", value, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REQUEST_TOTAL_NUM >=", value, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumLessThan(BigDecimal value) {
            addCriterion("REQUEST_TOTAL_NUM <", value, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REQUEST_TOTAL_NUM <=", value, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumIn(List<BigDecimal> values) {
            addCriterion("REQUEST_TOTAL_NUM in", values, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumNotIn(List<BigDecimal> values) {
            addCriterion("REQUEST_TOTAL_NUM not in", values, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQUEST_TOTAL_NUM between", value1, value2, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andRequestTotalNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REQUEST_TOTAL_NUM not between", value1, value2, "requestTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumIsNull() {
            addCriterion("ACTUAL_TOTAL_NUM is null");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumIsNotNull() {
            addCriterion("ACTUAL_TOTAL_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_NUM =", value, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_NUM <>", value, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_NUM >", value, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_NUM >=", value, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumLessThan(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_NUM <", value, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_TOTAL_NUM <=", value, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TOTAL_NUM in", values, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_TOTAL_NUM not in", values, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TOTAL_NUM between", value1, value2, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andActualTotalNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_TOTAL_NUM not between", value1, value2, "actualTotalNum");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNull() {
            addCriterion("PROCESS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNotNull() {
            addCriterion("PROCESS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusEqualTo(Short value) {
            addCriterion("PROCESS_STATUS =", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotEqualTo(Short value) {
            addCriterion("PROCESS_STATUS <>", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThan(Short value) {
            addCriterion("PROCESS_STATUS >", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PROCESS_STATUS >=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThan(Short value) {
            addCriterion("PROCESS_STATUS <", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThanOrEqualTo(Short value) {
            addCriterion("PROCESS_STATUS <=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIn(List<Short> values) {
            addCriterion("PROCESS_STATUS in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotIn(List<Short> values) {
            addCriterion("PROCESS_STATUS not in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusBetween(Short value1, Short value2) {
            addCriterion("PROCESS_STATUS between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotBetween(Short value1, Short value2) {
            addCriterion("PROCESS_STATUS not between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("CDATE is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("CDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("CDATE =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("CDATE <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("CDATE >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CDATE >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("CDATE <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("CDATE <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("CDATE in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("CDATE not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("CDATE between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("CDATE not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andEdateIsNull() {
            addCriterion("EDATE is null");
            return (Criteria) this;
        }

        public Criteria andEdateIsNotNull() {
            addCriterion("EDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEdateEqualTo(Date value) {
            addCriterion("EDATE =", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateNotEqualTo(Date value) {
            addCriterion("EDATE <>", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateGreaterThan(Date value) {
            addCriterion("EDATE >", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateGreaterThanOrEqualTo(Date value) {
            addCriterion("EDATE >=", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateLessThan(Date value) {
            addCriterion("EDATE <", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateLessThanOrEqualTo(Date value) {
            addCriterion("EDATE <=", value, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateIn(List<Date> values) {
            addCriterion("EDATE in", values, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateNotIn(List<Date> values) {
            addCriterion("EDATE not in", values, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateBetween(Date value1, Date value2) {
            addCriterion("EDATE between", value1, value2, "edate");
            return (Criteria) this;
        }

        public Criteria andEdateNotBetween(Date value1, Date value2) {
            addCriterion("EDATE not between", value1, value2, "edate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andEditorIsNull() {
            addCriterion("EDITOR is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("EDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("EDITOR =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("EDITOR <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("EDITOR >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("EDITOR >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("EDITOR <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("EDITOR <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("EDITOR like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("EDITOR not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("EDITOR in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("EDITOR not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("EDITOR between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("EDITOR not between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("\"STATUS\" is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("\"STATUS\" is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("\"STATUS\" =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("\"STATUS\" <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("\"STATUS\" >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("\"STATUS\" >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("\"STATUS\" <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("\"STATUS\" <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("\"STATUS\" like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("\"STATUS\" not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("\"STATUS\" in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("\"STATUS\" not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("\"STATUS\" between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("\"STATUS\" not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}