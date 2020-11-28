package com.itbs.persistence.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCenterResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCenterResourceExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andResourceNameIsNull() {
            addCriterion("RESOURCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("RESOURCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("RESOURCE_NAME =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("RESOURCE_NAME <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("RESOURCE_NAME >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_NAME >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("RESOURCE_NAME <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_NAME <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("RESOURCE_NAME like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("RESOURCE_NAME not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("RESOURCE_NAME in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("RESOURCE_NAME not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("RESOURCE_NAME between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_NAME not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andInaccountDateIsNull() {
            addCriterion("INACCOUNT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInaccountDateIsNotNull() {
            addCriterion("INACCOUNT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInaccountDateEqualTo(Date value) {
            addCriterionForJDBCDate("INACCOUNT_DATE =", value, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INACCOUNT_DATE <>", value, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateGreaterThan(Date value) {
            addCriterionForJDBCDate("INACCOUNT_DATE >", value, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INACCOUNT_DATE >=", value, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateLessThan(Date value) {
            addCriterionForJDBCDate("INACCOUNT_DATE <", value, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INACCOUNT_DATE <=", value, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateIn(List<Date> values) {
            addCriterionForJDBCDate("INACCOUNT_DATE in", values, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INACCOUNT_DATE not in", values, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INACCOUNT_DATE between", value1, value2, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andInaccountDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INACCOUNT_DATE not between", value1, value2, "inaccountDate");
            return (Criteria) this;
        }

        public Criteria andOriValueIsNull() {
            addCriterion("ORI_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andOriValueIsNotNull() {
            addCriterion("ORI_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andOriValueEqualTo(BigDecimal value) {
            addCriterion("ORI_VALUE =", value, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueNotEqualTo(BigDecimal value) {
            addCriterion("ORI_VALUE <>", value, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueGreaterThan(BigDecimal value) {
            addCriterion("ORI_VALUE >", value, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORI_VALUE >=", value, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueLessThan(BigDecimal value) {
            addCriterion("ORI_VALUE <", value, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORI_VALUE <=", value, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueIn(List<BigDecimal> values) {
            addCriterion("ORI_VALUE in", values, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueNotIn(List<BigDecimal> values) {
            addCriterion("ORI_VALUE not in", values, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORI_VALUE between", value1, value2, "oriValue");
            return (Criteria) this;
        }

        public Criteria andOriValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORI_VALUE not between", value1, value2, "oriValue");
            return (Criteria) this;
        }

        public Criteria andNetValueIsNull() {
            addCriterion("NET_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNetValueIsNotNull() {
            addCriterion("NET_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNetValueEqualTo(BigDecimal value) {
            addCriterion("NET_VALUE =", value, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueNotEqualTo(BigDecimal value) {
            addCriterion("NET_VALUE <>", value, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueGreaterThan(BigDecimal value) {
            addCriterion("NET_VALUE >", value, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_VALUE >=", value, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueLessThan(BigDecimal value) {
            addCriterion("NET_VALUE <", value, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_VALUE <=", value, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueIn(List<BigDecimal> values) {
            addCriterion("NET_VALUE in", values, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueNotIn(List<BigDecimal> values) {
            addCriterion("NET_VALUE not in", values, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_VALUE between", value1, value2, "netValue");
            return (Criteria) this;
        }

        public Criteria andNetValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_VALUE not between", value1, value2, "netValue");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationIsNull() {
            addCriterion("ACCRUALOFDE_PRECIATION is null");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationIsNotNull() {
            addCriterion("ACCRUALOFDE_PRECIATION is not null");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationEqualTo(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION =", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationNotEqualTo(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION <>", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationGreaterThan(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION >", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationGreaterThanOrEqualTo(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION >=", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationLessThan(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION <", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationLessThanOrEqualTo(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION <=", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationLike(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION like", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationNotLike(String value) {
            addCriterion("ACCRUALOFDE_PRECIATION not like", value, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationIn(List<String> values) {
            addCriterion("ACCRUALOFDE_PRECIATION in", values, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationNotIn(List<String> values) {
            addCriterion("ACCRUALOFDE_PRECIATION not in", values, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationBetween(String value1, String value2) {
            addCriterion("ACCRUALOFDE_PRECIATION between", value1, value2, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andAccrualofdePreciationNotBetween(String value1, String value2) {
            addCriterion("ACCRUALOFDE_PRECIATION not between", value1, value2, "accrualofdePreciation");
            return (Criteria) this;
        }

        public Criteria andLimitYearIsNull() {
            addCriterion("LIMIT_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andLimitYearIsNotNull() {
            addCriterion("LIMIT_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andLimitYearEqualTo(Integer value) {
            addCriterion("LIMIT_YEAR =", value, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearNotEqualTo(Integer value) {
            addCriterion("LIMIT_YEAR <>", value, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearGreaterThan(Integer value) {
            addCriterion("LIMIT_YEAR >", value, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_YEAR >=", value, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearLessThan(Integer value) {
            addCriterion("LIMIT_YEAR <", value, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_YEAR <=", value, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearIn(List<Integer> values) {
            addCriterion("LIMIT_YEAR in", values, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearNotIn(List<Integer> values) {
            addCriterion("LIMIT_YEAR not in", values, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_YEAR between", value1, value2, "limitYear");
            return (Criteria) this;
        }

        public Criteria andLimitYearNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_YEAR not between", value1, value2, "limitYear");
            return (Criteria) this;
        }

        public Criteria andKeeperIdIsNull() {
            addCriterion("KEEPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andKeeperIdIsNotNull() {
            addCriterion("KEEPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKeeperIdEqualTo(Integer value) {
            addCriterion("KEEPER_ID =", value, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdNotEqualTo(Integer value) {
            addCriterion("KEEPER_ID <>", value, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdGreaterThan(Integer value) {
            addCriterion("KEEPER_ID >", value, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("KEEPER_ID >=", value, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdLessThan(Integer value) {
            addCriterion("KEEPER_ID <", value, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdLessThanOrEqualTo(Integer value) {
            addCriterion("KEEPER_ID <=", value, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdIn(List<Integer> values) {
            addCriterion("KEEPER_ID in", values, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdNotIn(List<Integer> values) {
            addCriterion("KEEPER_ID not in", values, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdBetween(Integer value1, Integer value2) {
            addCriterion("KEEPER_ID between", value1, value2, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("KEEPER_ID not between", value1, value2, "keeperId");
            return (Criteria) this;
        }

        public Criteria andKeeperNameIsNull() {
            addCriterion("KEEPER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKeeperNameIsNotNull() {
            addCriterion("KEEPER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKeeperNameEqualTo(String value) {
            addCriterion("KEEPER_NAME =", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameNotEqualTo(String value) {
            addCriterion("KEEPER_NAME <>", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameGreaterThan(String value) {
            addCriterion("KEEPER_NAME >", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameGreaterThanOrEqualTo(String value) {
            addCriterion("KEEPER_NAME >=", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameLessThan(String value) {
            addCriterion("KEEPER_NAME <", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameLessThanOrEqualTo(String value) {
            addCriterion("KEEPER_NAME <=", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameLike(String value) {
            addCriterion("KEEPER_NAME like", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameNotLike(String value) {
            addCriterion("KEEPER_NAME not like", value, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameIn(List<String> values) {
            addCriterion("KEEPER_NAME in", values, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameNotIn(List<String> values) {
            addCriterion("KEEPER_NAME not in", values, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameBetween(String value1, String value2) {
            addCriterion("KEEPER_NAME between", value1, value2, "keeperName");
            return (Criteria) this;
        }

        public Criteria andKeeperNameNotBetween(String value1, String value2) {
            addCriterion("KEEPER_NAME not between", value1, value2, "keeperName");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterIsNull() {
            addCriterion("RESPONSIBILITY_CENTER is null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterIsNotNull() {
            addCriterion("RESPONSIBILITY_CENTER is not null");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterEqualTo(String value) {
            addCriterion("RESPONSIBILITY_CENTER =", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterNotEqualTo(String value) {
            addCriterion("RESPONSIBILITY_CENTER <>", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterGreaterThan(String value) {
            addCriterion("RESPONSIBILITY_CENTER >", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSIBILITY_CENTER >=", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterLessThan(String value) {
            addCriterion("RESPONSIBILITY_CENTER <", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterLessThanOrEqualTo(String value) {
            addCriterion("RESPONSIBILITY_CENTER <=", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterLike(String value) {
            addCriterion("RESPONSIBILITY_CENTER like", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterNotLike(String value) {
            addCriterion("RESPONSIBILITY_CENTER not like", value, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterIn(List<String> values) {
            addCriterion("RESPONSIBILITY_CENTER in", values, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterNotIn(List<String> values) {
            addCriterion("RESPONSIBILITY_CENTER not in", values, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterBetween(String value1, String value2) {
            addCriterion("RESPONSIBILITY_CENTER between", value1, value2, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andResponsibilityCenterNotBetween(String value1, String value2) {
            addCriterion("RESPONSIBILITY_CENTER not between", value1, value2, "responsibilityCenter");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("SPEC is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("SPEC =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("SPEC <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("SPEC >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("SPEC <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("SPEC <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("SPEC like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("SPEC not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("SPEC in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("SPEC not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("SPEC between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("SPEC not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andLiocationIsNull() {
            addCriterion("LIOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLiocationIsNotNull() {
            addCriterion("LIOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLiocationEqualTo(String value) {
            addCriterion("LIOCATION =", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationNotEqualTo(String value) {
            addCriterion("LIOCATION <>", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationGreaterThan(String value) {
            addCriterion("LIOCATION >", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationGreaterThanOrEqualTo(String value) {
            addCriterion("LIOCATION >=", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationLessThan(String value) {
            addCriterion("LIOCATION <", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationLessThanOrEqualTo(String value) {
            addCriterion("LIOCATION <=", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationLike(String value) {
            addCriterion("LIOCATION like", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationNotLike(String value) {
            addCriterion("LIOCATION not like", value, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationIn(List<String> values) {
            addCriterion("LIOCATION in", values, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationNotIn(List<String> values) {
            addCriterion("LIOCATION not in", values, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationBetween(String value1, String value2) {
            addCriterion("LIOCATION between", value1, value2, "liocation");
            return (Criteria) this;
        }

        public Criteria andLiocationNotBetween(String value1, String value2) {
            addCriterion("LIOCATION not between", value1, value2, "liocation");
            return (Criteria) this;
        }

        public Criteria andPandianSitIsNull() {
            addCriterion("PANDIAN_SIT is null");
            return (Criteria) this;
        }

        public Criteria andPandianSitIsNotNull() {
            addCriterion("PANDIAN_SIT is not null");
            return (Criteria) this;
        }

        public Criteria andPandianSitEqualTo(String value) {
            addCriterion("PANDIAN_SIT =", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitNotEqualTo(String value) {
            addCriterion("PANDIAN_SIT <>", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitGreaterThan(String value) {
            addCriterion("PANDIAN_SIT >", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitGreaterThanOrEqualTo(String value) {
            addCriterion("PANDIAN_SIT >=", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitLessThan(String value) {
            addCriterion("PANDIAN_SIT <", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitLessThanOrEqualTo(String value) {
            addCriterion("PANDIAN_SIT <=", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitLike(String value) {
            addCriterion("PANDIAN_SIT like", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitNotLike(String value) {
            addCriterion("PANDIAN_SIT not like", value, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitIn(List<String> values) {
            addCriterion("PANDIAN_SIT in", values, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitNotIn(List<String> values) {
            addCriterion("PANDIAN_SIT not in", values, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitBetween(String value1, String value2) {
            addCriterion("PANDIAN_SIT between", value1, value2, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andPandianSitNotBetween(String value1, String value2) {
            addCriterion("PANDIAN_SIT not between", value1, value2, "pandianSit");
            return (Criteria) this;
        }

        public Criteria andOtherInfoIsNull() {
            addCriterion("OTHER_INFO is null");
            return (Criteria) this;
        }

        public Criteria andOtherInfoIsNotNull() {
            addCriterion("OTHER_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInfoEqualTo(Object value) {
            addCriterion("OTHER_INFO =", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotEqualTo(Object value) {
            addCriterion("OTHER_INFO <>", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoGreaterThan(Object value) {
            addCriterion("OTHER_INFO >", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoGreaterThanOrEqualTo(Object value) {
            addCriterion("OTHER_INFO >=", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoLessThan(Object value) {
            addCriterion("OTHER_INFO <", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoLessThanOrEqualTo(Object value) {
            addCriterion("OTHER_INFO <=", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoIn(List<Object> values) {
            addCriterion("OTHER_INFO in", values, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotIn(List<Object> values) {
            addCriterion("OTHER_INFO not in", values, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoBetween(Object value1, Object value2) {
            addCriterion("OTHER_INFO between", value1, value2, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotBetween(Object value1, Object value2) {
            addCriterion("OTHER_INFO not between", value1, value2, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("SKU_ID =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("SKU_ID <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("SKU_ID >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_ID >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("SKU_ID <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_ID <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("SKU_ID in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("SKU_ID not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("SKU_ID between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_ID not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNull() {
            addCriterion("SPU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("SPU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(Integer value) {
            addCriterion("SPU_ID =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Integer value) {
            addCriterion("SPU_ID <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Integer value) {
            addCriterion("SPU_ID >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPU_ID >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Integer value) {
            addCriterion("SPU_ID <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Integer value) {
            addCriterion("SPU_ID <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<Integer> values) {
            addCriterion("SPU_ID in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<Integer> values) {
            addCriterion("SPU_ID not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(Integer value1, Integer value2) {
            addCriterion("SPU_ID between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SPU_ID not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
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