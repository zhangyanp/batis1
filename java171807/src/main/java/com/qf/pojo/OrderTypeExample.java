package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andOtypeIdIsNull() {
            addCriterion("otype_id is null");
            return (Criteria) this;
        }

        public Criteria andOtypeIdIsNotNull() {
            addCriterion("otype_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtypeIdEqualTo(Long value) {
            addCriterion("otype_id =", value, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdNotEqualTo(Long value) {
            addCriterion("otype_id <>", value, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdGreaterThan(Long value) {
            addCriterion("otype_id >", value, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("otype_id >=", value, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdLessThan(Long value) {
            addCriterion("otype_id <", value, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdLessThanOrEqualTo(Long value) {
            addCriterion("otype_id <=", value, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdIn(List<Long> values) {
            addCriterion("otype_id in", values, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdNotIn(List<Long> values) {
            addCriterion("otype_id not in", values, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdBetween(Long value1, Long value2) {
            addCriterion("otype_id between", value1, value2, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeIdNotBetween(Long value1, Long value2) {
            addCriterion("otype_id not between", value1, value2, "otypeId");
            return (Criteria) this;
        }

        public Criteria andOtypeNameIsNull() {
            addCriterion("otype_name is null");
            return (Criteria) this;
        }

        public Criteria andOtypeNameIsNotNull() {
            addCriterion("otype_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtypeNameEqualTo(String value) {
            addCriterion("otype_name =", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameNotEqualTo(String value) {
            addCriterion("otype_name <>", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameGreaterThan(String value) {
            addCriterion("otype_name >", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("otype_name >=", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameLessThan(String value) {
            addCriterion("otype_name <", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameLessThanOrEqualTo(String value) {
            addCriterion("otype_name <=", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameLike(String value) {
            addCriterion("otype_name like", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameNotLike(String value) {
            addCriterion("otype_name not like", value, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameIn(List<String> values) {
            addCriterion("otype_name in", values, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameNotIn(List<String> values) {
            addCriterion("otype_name not in", values, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameBetween(String value1, String value2) {
            addCriterion("otype_name between", value1, value2, "otypeName");
            return (Criteria) this;
        }

        public Criteria andOtypeNameNotBetween(String value1, String value2) {
            addCriterion("otype_name not between", value1, value2, "otypeName");
            return (Criteria) this;
        }
    }

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