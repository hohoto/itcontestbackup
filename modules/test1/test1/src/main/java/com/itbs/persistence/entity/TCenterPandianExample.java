package com.itbs.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCenterPandianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCenterPandianExample() {
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

        public Criteria andPandianCodeIsNull() {
            addCriterion("PANDIAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPandianCodeIsNotNull() {
            addCriterion("PANDIAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPandianCodeEqualTo(String value) {
            addCriterion("PANDIAN_CODE =", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeNotEqualTo(String value) {
            addCriterion("PANDIAN_CODE <>", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeGreaterThan(String value) {
            addCriterion("PANDIAN_CODE >", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PANDIAN_CODE >=", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeLessThan(String value) {
            addCriterion("PANDIAN_CODE <", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeLessThanOrEqualTo(String value) {
            addCriterion("PANDIAN_CODE <=", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeLike(String value) {
            addCriterion("PANDIAN_CODE like", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeNotLike(String value) {
            addCriterion("PANDIAN_CODE not like", value, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeIn(List<String> values) {
            addCriterion("PANDIAN_CODE in", values, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeNotIn(List<String> values) {
            addCriterion("PANDIAN_CODE not in", values, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeBetween(String value1, String value2) {
            addCriterion("PANDIAN_CODE between", value1, value2, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPandianCodeNotBetween(String value1, String value2) {
            addCriterion("PANDIAN_CODE not between", value1, value2, "pandianCode");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateIsNull() {
            addCriterion("PLAN_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateIsNotNull() {
            addCriterion("PLAN_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE =", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateNotEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE <>", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateGreaterThan(Date value) {
            addCriterion("PLAN_BEGIN_DATE >", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE >=", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateLessThan(Date value) {
            addCriterion("PLAN_BEGIN_DATE <", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_BEGIN_DATE <=", value, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateIn(List<Date> values) {
            addCriterion("PLAN_BEGIN_DATE in", values, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateNotIn(List<Date> values) {
            addCriterion("PLAN_BEGIN_DATE not in", values, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_BEGIN_DATE between", value1, value2, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_BEGIN_DATE not between", value1, value2, "planBeginDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIsNull() {
            addCriterion("PLAN_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIsNotNull() {
            addCriterion("PLAN_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateEqualTo(Date value) {
            addCriterion("PLAN_END_DATE =", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotEqualTo(Date value) {
            addCriterion("PLAN_END_DATE <>", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateGreaterThan(Date value) {
            addCriterion("PLAN_END_DATE >", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_DATE >=", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateLessThan(Date value) {
            addCriterion("PLAN_END_DATE <", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_END_DATE <=", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIn(List<Date> values) {
            addCriterion("PLAN_END_DATE in", values, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotIn(List<Date> values) {
            addCriterion("PLAN_END_DATE not in", values, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_DATE between", value1, value2, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_END_DATE not between", value1, value2, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateIsNull() {
            addCriterion("ACTUAL_BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateIsNotNull() {
            addCriterion("ACTUAL_BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateEqualTo(Date value) {
            addCriterion("ACTUAL_BEGIN_DATE =", value, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateNotEqualTo(Date value) {
            addCriterion("ACTUAL_BEGIN_DATE <>", value, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateGreaterThan(Date value) {
            addCriterion("ACTUAL_BEGIN_DATE >", value, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_BEGIN_DATE >=", value, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateLessThan(Date value) {
            addCriterion("ACTUAL_BEGIN_DATE <", value, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_BEGIN_DATE <=", value, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateIn(List<Date> values) {
            addCriterion("ACTUAL_BEGIN_DATE in", values, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateNotIn(List<Date> values) {
            addCriterion("ACTUAL_BEGIN_DATE not in", values, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_BEGIN_DATE between", value1, value2, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_BEGIN_DATE not between", value1, value2, "actualBeginDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateIsNull() {
            addCriterion("ACTUAL_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActualEndDateIsNotNull() {
            addCriterion("ACTUAL_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndDateEqualTo(Date value) {
            addCriterion("ACTUAL_END_DATE =", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateNotEqualTo(Date value) {
            addCriterion("ACTUAL_END_DATE <>", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateGreaterThan(Date value) {
            addCriterion("ACTUAL_END_DATE >", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_END_DATE >=", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateLessThan(Date value) {
            addCriterion("ACTUAL_END_DATE <", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateLessThanOrEqualTo(Date value) {
            addCriterion("ACTUAL_END_DATE <=", value, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateIn(List<Date> values) {
            addCriterion("ACTUAL_END_DATE in", values, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateNotIn(List<Date> values) {
            addCriterion("ACTUAL_END_DATE not in", values, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_END_DATE between", value1, value2, "actualEndDate");
            return (Criteria) this;
        }

        public Criteria andActualEndDateNotBetween(Date value1, Date value2) {
            addCriterion("ACTUAL_END_DATE not between", value1, value2, "actualEndDate");
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

        public Criteria andPersonCompanyIdIsNull() {
            addCriterion("PERSON_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdIsNotNull() {
            addCriterion("PERSON_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdEqualTo(Integer value) {
            addCriterion("PERSON_COMPANY_ID =", value, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdNotEqualTo(Integer value) {
            addCriterion("PERSON_COMPANY_ID <>", value, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdGreaterThan(Integer value) {
            addCriterion("PERSON_COMPANY_ID >", value, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERSON_COMPANY_ID >=", value, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdLessThan(Integer value) {
            addCriterion("PERSON_COMPANY_ID <", value, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("PERSON_COMPANY_ID <=", value, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdIn(List<Integer> values) {
            addCriterion("PERSON_COMPANY_ID in", values, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdNotIn(List<Integer> values) {
            addCriterion("PERSON_COMPANY_ID not in", values, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_COMPANY_ID between", value1, value2, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_COMPANY_ID not between", value1, value2, "personCompanyId");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameIsNull() {
            addCriterion("PERSON_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameIsNotNull() {
            addCriterion("PERSON_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameEqualTo(String value) {
            addCriterion("PERSON_COMPANY_NAME =", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameNotEqualTo(String value) {
            addCriterion("PERSON_COMPANY_NAME <>", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameGreaterThan(String value) {
            addCriterion("PERSON_COMPANY_NAME >", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_COMPANY_NAME >=", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameLessThan(String value) {
            addCriterion("PERSON_COMPANY_NAME <", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("PERSON_COMPANY_NAME <=", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameLike(String value) {
            addCriterion("PERSON_COMPANY_NAME like", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameNotLike(String value) {
            addCriterion("PERSON_COMPANY_NAME not like", value, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameIn(List<String> values) {
            addCriterion("PERSON_COMPANY_NAME in", values, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameNotIn(List<String> values) {
            addCriterion("PERSON_COMPANY_NAME not in", values, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameBetween(String value1, String value2) {
            addCriterion("PERSON_COMPANY_NAME between", value1, value2, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNameNotBetween(String value1, String value2) {
            addCriterion("PERSON_COMPANY_NAME not between", value1, value2, "personCompanyName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdIsNull() {
            addCriterion("PERSON_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdIsNotNull() {
            addCriterion("PERSON_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdEqualTo(Integer value) {
            addCriterion("PERSON_DEPARTMENT_ID =", value, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdNotEqualTo(Integer value) {
            addCriterion("PERSON_DEPARTMENT_ID <>", value, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdGreaterThan(Integer value) {
            addCriterion("PERSON_DEPARTMENT_ID >", value, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERSON_DEPARTMENT_ID >=", value, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdLessThan(Integer value) {
            addCriterion("PERSON_DEPARTMENT_ID <", value, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PERSON_DEPARTMENT_ID <=", value, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdIn(List<Integer> values) {
            addCriterion("PERSON_DEPARTMENT_ID in", values, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdNotIn(List<Integer> values) {
            addCriterion("PERSON_DEPARTMENT_ID not in", values, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_DEPARTMENT_ID between", value1, value2, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_DEPARTMENT_ID not between", value1, value2, "personDepartmentId");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameIsNull() {
            addCriterion("PERSON_DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameIsNotNull() {
            addCriterion("PERSON_DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameEqualTo(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME =", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameNotEqualTo(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME <>", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameGreaterThan(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME >", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME >=", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameLessThan(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME <", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME <=", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameLike(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME like", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameNotLike(String value) {
            addCriterion("PERSON_DEPARTMENT_NAME not like", value, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameIn(List<String> values) {
            addCriterion("PERSON_DEPARTMENT_NAME in", values, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameNotIn(List<String> values) {
            addCriterion("PERSON_DEPARTMENT_NAME not in", values, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameBetween(String value1, String value2) {
            addCriterion("PERSON_DEPARTMENT_NAME between", value1, value2, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("PERSON_DEPARTMENT_NAME not between", value1, value2, "personDepartmentName");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdIsNull() {
            addCriterion("PERSON_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdIsNotNull() {
            addCriterion("PERSON_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdEqualTo(Integer value) {
            addCriterion("PERSON_USER_ID =", value, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdNotEqualTo(Integer value) {
            addCriterion("PERSON_USER_ID <>", value, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdGreaterThan(Integer value) {
            addCriterion("PERSON_USER_ID >", value, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERSON_USER_ID >=", value, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdLessThan(Integer value) {
            addCriterion("PERSON_USER_ID <", value, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("PERSON_USER_ID <=", value, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdIn(List<Integer> values) {
            addCriterion("PERSON_USER_ID in", values, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdNotIn(List<Integer> values) {
            addCriterion("PERSON_USER_ID not in", values, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_USER_ID between", value1, value2, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PERSON_USER_ID not between", value1, value2, "personUserId");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameIsNull() {
            addCriterion("PERSON_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameIsNotNull() {
            addCriterion("PERSON_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameEqualTo(String value) {
            addCriterion("PERSON_USER_NAME =", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameNotEqualTo(String value) {
            addCriterion("PERSON_USER_NAME <>", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameGreaterThan(String value) {
            addCriterion("PERSON_USER_NAME >", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_USER_NAME >=", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameLessThan(String value) {
            addCriterion("PERSON_USER_NAME <", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameLessThanOrEqualTo(String value) {
            addCriterion("PERSON_USER_NAME <=", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameLike(String value) {
            addCriterion("PERSON_USER_NAME like", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameNotLike(String value) {
            addCriterion("PERSON_USER_NAME not like", value, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameIn(List<String> values) {
            addCriterion("PERSON_USER_NAME in", values, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameNotIn(List<String> values) {
            addCriterion("PERSON_USER_NAME not in", values, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameBetween(String value1, String value2) {
            addCriterion("PERSON_USER_NAME between", value1, value2, "personUserName");
            return (Criteria) this;
        }

        public Criteria andPersonUserNameNotBetween(String value1, String value2) {
            addCriterion("PERSON_USER_NAME not between", value1, value2, "personUserName");
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

        public Criteria andPlanQtyIsNull() {
            addCriterion("PLAN_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPlanQtyIsNotNull() {
            addCriterion("PLAN_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPlanQtyEqualTo(Integer value) {
            addCriterion("PLAN_QTY =", value, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyNotEqualTo(Integer value) {
            addCriterion("PLAN_QTY <>", value, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyGreaterThan(Integer value) {
            addCriterion("PLAN_QTY >", value, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_QTY >=", value, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyLessThan(Integer value) {
            addCriterion("PLAN_QTY <", value, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_QTY <=", value, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyIn(List<Integer> values) {
            addCriterion("PLAN_QTY in", values, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyNotIn(List<Integer> values) {
            addCriterion("PLAN_QTY not in", values, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_QTY between", value1, value2, "planQty");
            return (Criteria) this;
        }

        public Criteria andPlanQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_QTY not between", value1, value2, "planQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyIsNull() {
            addCriterion("ACTUAL_QTY is null");
            return (Criteria) this;
        }

        public Criteria andActualQtyIsNotNull() {
            addCriterion("ACTUAL_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andActualQtyEqualTo(Integer value) {
            addCriterion("ACTUAL_QTY =", value, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyNotEqualTo(Integer value) {
            addCriterion("ACTUAL_QTY <>", value, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyGreaterThan(Integer value) {
            addCriterion("ACTUAL_QTY >", value, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTUAL_QTY >=", value, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyLessThan(Integer value) {
            addCriterion("ACTUAL_QTY <", value, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyLessThanOrEqualTo(Integer value) {
            addCriterion("ACTUAL_QTY <=", value, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyIn(List<Integer> values) {
            addCriterion("ACTUAL_QTY in", values, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyNotIn(List<Integer> values) {
            addCriterion("ACTUAL_QTY not in", values, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyBetween(Integer value1, Integer value2) {
            addCriterion("ACTUAL_QTY between", value1, value2, "actualQty");
            return (Criteria) this;
        }

        public Criteria andActualQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTUAL_QTY not between", value1, value2, "actualQty");
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