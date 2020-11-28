package com.itbs.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCenterPandianDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCenterPandianDetailExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPandianIdIsNull() {
            addCriterion("PANDIAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPandianIdIsNotNull() {
            addCriterion("PANDIAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPandianIdEqualTo(String value) {
            addCriterion("PANDIAN_ID =", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdNotEqualTo(String value) {
            addCriterion("PANDIAN_ID <>", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdGreaterThan(String value) {
            addCriterion("PANDIAN_ID >", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdGreaterThanOrEqualTo(String value) {
            addCriterion("PANDIAN_ID >=", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdLessThan(String value) {
            addCriterion("PANDIAN_ID <", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdLessThanOrEqualTo(String value) {
            addCriterion("PANDIAN_ID <=", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdLike(String value) {
            addCriterion("PANDIAN_ID like", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdNotLike(String value) {
            addCriterion("PANDIAN_ID not like", value, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdIn(List<String> values) {
            addCriterion("PANDIAN_ID in", values, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdNotIn(List<String> values) {
            addCriterion("PANDIAN_ID not in", values, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdBetween(String value1, String value2) {
            addCriterion("PANDIAN_ID between", value1, value2, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianIdNotBetween(String value1, String value2) {
            addCriterion("PANDIAN_ID not between", value1, value2, "pandianId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdIsNull() {
            addCriterion("PANDIAN_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdIsNotNull() {
            addCriterion("PANDIAN_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdEqualTo(Integer value) {
            addCriterion("PANDIAN_DETAIL_ID =", value, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdNotEqualTo(Integer value) {
            addCriterion("PANDIAN_DETAIL_ID <>", value, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdGreaterThan(Integer value) {
            addCriterion("PANDIAN_DETAIL_ID >", value, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PANDIAN_DETAIL_ID >=", value, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdLessThan(Integer value) {
            addCriterion("PANDIAN_DETAIL_ID <", value, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("PANDIAN_DETAIL_ID <=", value, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdIn(List<Integer> values) {
            addCriterion("PANDIAN_DETAIL_ID in", values, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdNotIn(List<Integer> values) {
            addCriterion("PANDIAN_DETAIL_ID not in", values, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("PANDIAN_DETAIL_ID between", value1, value2, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PANDIAN_DETAIL_ID not between", value1, value2, "pandianDetailId");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeIsNull() {
            addCriterion("PANDIAN_DETAIL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeIsNotNull() {
            addCriterion("PANDIAN_DETAIL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeEqualTo(String value) {
            addCriterion("PANDIAN_DETAIL_CODE =", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeNotEqualTo(String value) {
            addCriterion("PANDIAN_DETAIL_CODE <>", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeGreaterThan(String value) {
            addCriterion("PANDIAN_DETAIL_CODE >", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PANDIAN_DETAIL_CODE >=", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeLessThan(String value) {
            addCriterion("PANDIAN_DETAIL_CODE <", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("PANDIAN_DETAIL_CODE <=", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeLike(String value) {
            addCriterion("PANDIAN_DETAIL_CODE like", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeNotLike(String value) {
            addCriterion("PANDIAN_DETAIL_CODE not like", value, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeIn(List<String> values) {
            addCriterion("PANDIAN_DETAIL_CODE in", values, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeNotIn(List<String> values) {
            addCriterion("PANDIAN_DETAIL_CODE not in", values, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeBetween(String value1, String value2) {
            addCriterion("PANDIAN_DETAIL_CODE between", value1, value2, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andPandianDetailCodeNotBetween(String value1, String value2) {
            addCriterion("PANDIAN_DETAIL_CODE not between", value1, value2, "pandianDetailCode");
            return (Criteria) this;
        }

        public Criteria andIsHlIsNull() {
            addCriterion("IS_HL is null");
            return (Criteria) this;
        }

        public Criteria andIsHlIsNotNull() {
            addCriterion("IS_HL is not null");
            return (Criteria) this;
        }

        public Criteria andIsHlEqualTo(Integer value) {
            addCriterion("IS_HL =", value, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlNotEqualTo(Integer value) {
            addCriterion("IS_HL <>", value, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlGreaterThan(Integer value) {
            addCriterion("IS_HL >", value, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_HL >=", value, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlLessThan(Integer value) {
            addCriterion("IS_HL <", value, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlLessThanOrEqualTo(Integer value) {
            addCriterion("IS_HL <=", value, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlIn(List<Integer> values) {
            addCriterion("IS_HL in", values, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlNotIn(List<Integer> values) {
            addCriterion("IS_HL not in", values, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlBetween(Integer value1, Integer value2) {
            addCriterion("IS_HL between", value1, value2, "isHl");
            return (Criteria) this;
        }

        public Criteria andIsHlNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_HL not between", value1, value2, "isHl");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNull() {
            addCriterion("RESOURCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIsNotNull() {
            addCriterion("RESOURCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceCodeEqualTo(String value) {
            addCriterion("RESOURCE_CODE =", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotEqualTo(String value) {
            addCriterion("RESOURCE_CODE <>", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThan(String value) {
            addCriterion("RESOURCE_CODE >", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_CODE >=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThan(String value) {
            addCriterion("RESOURCE_CODE <", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_CODE <=", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeLike(String value) {
            addCriterion("RESOURCE_CODE like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotLike(String value) {
            addCriterion("RESOURCE_CODE not like", value, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeIn(List<String> values) {
            addCriterion("RESOURCE_CODE in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotIn(List<String> values) {
            addCriterion("RESOURCE_CODE not in", values, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeBetween(String value1, String value2) {
            addCriterion("RESOURCE_CODE between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andResourceCodeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_CODE not between", value1, value2, "resourceCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNull() {
            addCriterion("LOCATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIsNotNull() {
            addCriterion("LOCATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCodeEqualTo(String value) {
            addCriterion("LOCATION_CODE =", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotEqualTo(String value) {
            addCriterion("LOCATION_CODE <>", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThan(String value) {
            addCriterion("LOCATION_CODE >", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION_CODE >=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThan(String value) {
            addCriterion("LOCATION_CODE <", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLessThanOrEqualTo(String value) {
            addCriterion("LOCATION_CODE <=", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeLike(String value) {
            addCriterion("LOCATION_CODE like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotLike(String value) {
            addCriterion("LOCATION_CODE not like", value, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeIn(List<String> values) {
            addCriterion("LOCATION_CODE in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotIn(List<String> values) {
            addCriterion("LOCATION_CODE not in", values, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeBetween(String value1, String value2) {
            addCriterion("LOCATION_CODE between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andLocationCodeNotBetween(String value1, String value2) {
            addCriterion("LOCATION_CODE not between", value1, value2, "locationCode");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("DATE is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("DATE =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("DATE <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("DATE >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("DATE <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("DATE <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("DATE in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("DATE not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("DATE between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("DATE not between", value1, value2, "date");
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