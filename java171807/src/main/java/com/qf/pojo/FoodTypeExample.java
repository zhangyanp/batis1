package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class FoodTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodTypeExample() {
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

        public Criteria andFtypeIdIsNull() {
            addCriterion("ftype_id is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIdIsNotNull() {
            addCriterion("ftype_id is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeIdEqualTo(Long value) {
            addCriterion("ftype_id =", value, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdNotEqualTo(Long value) {
            addCriterion("ftype_id <>", value, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdGreaterThan(Long value) {
            addCriterion("ftype_id >", value, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ftype_id >=", value, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdLessThan(Long value) {
            addCriterion("ftype_id <", value, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdLessThanOrEqualTo(Long value) {
            addCriterion("ftype_id <=", value, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdIn(List<Long> values) {
            addCriterion("ftype_id in", values, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdNotIn(List<Long> values) {
            addCriterion("ftype_id not in", values, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdBetween(Long value1, Long value2) {
            addCriterion("ftype_id between", value1, value2, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeIdNotBetween(Long value1, Long value2) {
            addCriterion("ftype_id not between", value1, value2, "ftypeId");
            return (Criteria) this;
        }

        public Criteria andFtypeNameIsNull() {
            addCriterion("ftype_name is null");
            return (Criteria) this;
        }

        public Criteria andFtypeNameIsNotNull() {
            addCriterion("ftype_name is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeNameEqualTo(String value) {
            addCriterion("ftype_name =", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameNotEqualTo(String value) {
            addCriterion("ftype_name <>", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameGreaterThan(String value) {
            addCriterion("ftype_name >", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ftype_name >=", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameLessThan(String value) {
            addCriterion("ftype_name <", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameLessThanOrEqualTo(String value) {
            addCriterion("ftype_name <=", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameLike(String value) {
            addCriterion("ftype_name like", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameNotLike(String value) {
            addCriterion("ftype_name not like", value, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameIn(List<String> values) {
            addCriterion("ftype_name in", values, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameNotIn(List<String> values) {
            addCriterion("ftype_name not in", values, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameBetween(String value1, String value2) {
            addCriterion("ftype_name between", value1, value2, "ftypeName");
            return (Criteria) this;
        }

        public Criteria andFtypeNameNotBetween(String value1, String value2) {
            addCriterion("ftype_name not between", value1, value2, "ftypeName");
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