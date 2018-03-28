package com.qf.pojo;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Long value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Long value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Long value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Long value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Long value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Long> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Long> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Long value1, Long value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Long value1, Long value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("food_price is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("food_price is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(Double value) {
            addCriterion("food_price =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(Double value) {
            addCriterion("food_price <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(Double value) {
            addCriterion("food_price >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("food_price >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(Double value) {
            addCriterion("food_price <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(Double value) {
            addCriterion("food_price <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<Double> values) {
            addCriterion("food_price in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<Double> values) {
            addCriterion("food_price not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(Double value1, Double value2) {
            addCriterion("food_price between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(Double value1, Double value2) {
            addCriterion("food_price not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPictureIsNull() {
            addCriterion("food_picture is null");
            return (Criteria) this;
        }

        public Criteria andFoodPictureIsNotNull() {
            addCriterion("food_picture is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPictureEqualTo(String value) {
            addCriterion("food_picture =", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureNotEqualTo(String value) {
            addCriterion("food_picture <>", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureGreaterThan(String value) {
            addCriterion("food_picture >", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureGreaterThanOrEqualTo(String value) {
            addCriterion("food_picture >=", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureLessThan(String value) {
            addCriterion("food_picture <", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureLessThanOrEqualTo(String value) {
            addCriterion("food_picture <=", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureLike(String value) {
            addCriterion("food_picture like", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureNotLike(String value) {
            addCriterion("food_picture not like", value, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureIn(List<String> values) {
            addCriterion("food_picture in", values, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureNotIn(List<String> values) {
            addCriterion("food_picture not in", values, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureBetween(String value1, String value2) {
            addCriterion("food_picture between", value1, value2, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodPictureNotBetween(String value1, String value2) {
            addCriterion("food_picture not between", value1, value2, "foodPicture");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsNull() {
            addCriterion("food_type is null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsNotNull() {
            addCriterion("food_type is not null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeEqualTo(Long value) {
            addCriterion("food_type =", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNotEqualTo(Long value) {
            addCriterion("food_type <>", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeGreaterThan(Long value) {
            addCriterion("food_type >", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("food_type >=", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeLessThan(Long value) {
            addCriterion("food_type <", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeLessThanOrEqualTo(Long value) {
            addCriterion("food_type <=", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIn(List<Long> values) {
            addCriterion("food_type in", values, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNotIn(List<Long> values) {
            addCriterion("food_type not in", values, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeBetween(Long value1, Long value2) {
            addCriterion("food_type between", value1, value2, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNotBetween(Long value1, Long value2) {
            addCriterion("food_type not between", value1, value2, "foodType");
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