package com.itbs.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDdApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDdApplyExample() {
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

        public Criteria andApplyCodeIsNull() {
            addCriterion("APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("APPLY_CODE =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("APPLY_CODE <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("APPLY_CODE >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("APPLY_CODE <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("APPLY_CODE like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("APPLY_CODE not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("APPLY_CODE in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("APPLY_CODE not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("APPLY_CODE between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_CODE not between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("COMPANY_NAME =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("COMPANY_NAME <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("COMPANY_NAME >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("COMPANY_NAME <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_NAME <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("COMPANY_NAME like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("COMPANY_NAME not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("COMPANY_NAME in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("COMPANY_NAME not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("COMPANY_NAME not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("DEPARTMENT_NAME >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("DEPARTMENT_NAME <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_NAME <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("DEPARTMENT_NAME like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("DEPARTMENT_NAME not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("DEPARTMENT_NAME not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_NAME not between", value1, value2, "departmentName");
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

        public Criteria andYongTuIsNull() {
            addCriterion("YONG_TU is null");
            return (Criteria) this;
        }

        public Criteria andYongTuIsNotNull() {
            addCriterion("YONG_TU is not null");
            return (Criteria) this;
        }

        public Criteria andYongTuEqualTo(String value) {
            addCriterion("YONG_TU =", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuNotEqualTo(String value) {
            addCriterion("YONG_TU <>", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuGreaterThan(String value) {
            addCriterion("YONG_TU >", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuGreaterThanOrEqualTo(String value) {
            addCriterion("YONG_TU >=", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuLessThan(String value) {
            addCriterion("YONG_TU <", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuLessThanOrEqualTo(String value) {
            addCriterion("YONG_TU <=", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuLike(String value) {
            addCriterion("YONG_TU like", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuNotLike(String value) {
            addCriterion("YONG_TU not like", value, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuIn(List<String> values) {
            addCriterion("YONG_TU in", values, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuNotIn(List<String> values) {
            addCriterion("YONG_TU not in", values, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuBetween(String value1, String value2) {
            addCriterion("YONG_TU between", value1, value2, "yongTu");
            return (Criteria) this;
        }

        public Criteria andYongTuNotBetween(String value1, String value2) {
            addCriterion("YONG_TU not between", value1, value2, "yongTu");
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

        public Criteria andShenPiCompanyIdIsNull() {
            addCriterion("SHEN_PI_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdIsNotNull() {
            addCriterion("SHEN_PI_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdEqualTo(Integer value) {
            addCriterion("SHEN_PI_COMPANY_ID =", value, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdNotEqualTo(Integer value) {
            addCriterion("SHEN_PI_COMPANY_ID <>", value, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdGreaterThan(Integer value) {
            addCriterion("SHEN_PI_COMPANY_ID >", value, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHEN_PI_COMPANY_ID >=", value, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdLessThan(Integer value) {
            addCriterion("SHEN_PI_COMPANY_ID <", value, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHEN_PI_COMPANY_ID <=", value, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdIn(List<Integer> values) {
            addCriterion("SHEN_PI_COMPANY_ID in", values, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdNotIn(List<Integer> values) {
            addCriterion("SHEN_PI_COMPANY_ID not in", values, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("SHEN_PI_COMPANY_ID between", value1, value2, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHEN_PI_COMPANY_ID not between", value1, value2, "shenPiCompanyId");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameIsNull() {
            addCriterion("SHEN_PI_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameIsNotNull() {
            addCriterion("SHEN_PI_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameEqualTo(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME =", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameNotEqualTo(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME <>", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameGreaterThan(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME >", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME >=", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameLessThan(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME <", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME <=", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameLike(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME like", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameNotLike(String value) {
            addCriterion("SHEN_PI_COMPANY_NAME not like", value, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameIn(List<String> values) {
            addCriterion("SHEN_PI_COMPANY_NAME in", values, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameNotIn(List<String> values) {
            addCriterion("SHEN_PI_COMPANY_NAME not in", values, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameBetween(String value1, String value2) {
            addCriterion("SHEN_PI_COMPANY_NAME between", value1, value2, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiCompanyNameNotBetween(String value1, String value2) {
            addCriterion("SHEN_PI_COMPANY_NAME not between", value1, value2, "shenPiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdIsNull() {
            addCriterion("SHEN_PI_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdIsNotNull() {
            addCriterion("SHEN_PI_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdEqualTo(Integer value) {
            addCriterion("SHEN_PI_DEPARTMENT_ID =", value, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdNotEqualTo(Integer value) {
            addCriterion("SHEN_PI_DEPARTMENT_ID <>", value, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdGreaterThan(Integer value) {
            addCriterion("SHEN_PI_DEPARTMENT_ID >", value, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHEN_PI_DEPARTMENT_ID >=", value, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdLessThan(Integer value) {
            addCriterion("SHEN_PI_DEPARTMENT_ID <", value, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHEN_PI_DEPARTMENT_ID <=", value, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdIn(List<Integer> values) {
            addCriterion("SHEN_PI_DEPARTMENT_ID in", values, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdNotIn(List<Integer> values) {
            addCriterion("SHEN_PI_DEPARTMENT_ID not in", values, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("SHEN_PI_DEPARTMENT_ID between", value1, value2, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHEN_PI_DEPARTMENT_ID not between", value1, value2, "shenPiDepartmentId");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameIsNull() {
            addCriterion("SHEN_PI_DEPARTMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameIsNotNull() {
            addCriterion("SHEN_PI_DEPARTMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameEqualTo(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME =", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameNotEqualTo(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME <>", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameGreaterThan(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME >", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME >=", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameLessThan(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME <", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME <=", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameLike(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME like", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameNotLike(String value) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME not like", value, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameIn(List<String> values) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME in", values, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameNotIn(List<String> values) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME not in", values, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameBetween(String value1, String value2) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME between", value1, value2, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("SHEN_PI_DEPARTMENT_NAME not between", value1, value2, "shenPiDepartmentName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdIsNull() {
            addCriterion("SHEN_PI_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdIsNotNull() {
            addCriterion("SHEN_PI_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdEqualTo(Integer value) {
            addCriterion("SHEN_PI_USER_ID =", value, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdNotEqualTo(Integer value) {
            addCriterion("SHEN_PI_USER_ID <>", value, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdGreaterThan(Integer value) {
            addCriterion("SHEN_PI_USER_ID >", value, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHEN_PI_USER_ID >=", value, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdLessThan(Integer value) {
            addCriterion("SHEN_PI_USER_ID <", value, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("SHEN_PI_USER_ID <=", value, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdIn(List<Integer> values) {
            addCriterion("SHEN_PI_USER_ID in", values, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdNotIn(List<Integer> values) {
            addCriterion("SHEN_PI_USER_ID not in", values, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdBetween(Integer value1, Integer value2) {
            addCriterion("SHEN_PI_USER_ID between", value1, value2, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SHEN_PI_USER_ID not between", value1, value2, "shenPiUserId");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameIsNull() {
            addCriterion("SHEN_PI_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameIsNotNull() {
            addCriterion("SHEN_PI_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameEqualTo(String value) {
            addCriterion("SHEN_PI_USER_NAME =", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameNotEqualTo(String value) {
            addCriterion("SHEN_PI_USER_NAME <>", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameGreaterThan(String value) {
            addCriterion("SHEN_PI_USER_NAME >", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHEN_PI_USER_NAME >=", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameLessThan(String value) {
            addCriterion("SHEN_PI_USER_NAME <", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameLessThanOrEqualTo(String value) {
            addCriterion("SHEN_PI_USER_NAME <=", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameLike(String value) {
            addCriterion("SHEN_PI_USER_NAME like", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameNotLike(String value) {
            addCriterion("SHEN_PI_USER_NAME not like", value, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameIn(List<String> values) {
            addCriterion("SHEN_PI_USER_NAME in", values, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameNotIn(List<String> values) {
            addCriterion("SHEN_PI_USER_NAME not in", values, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameBetween(String value1, String value2) {
            addCriterion("SHEN_PI_USER_NAME between", value1, value2, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenPiUserNameNotBetween(String value1, String value2) {
            addCriterion("SHEN_PI_USER_NAME not between", value1, value2, "shenPiUserName");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonIsNull() {
            addCriterion("SHENPI_REASON is null");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonIsNotNull() {
            addCriterion("SHENPI_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonEqualTo(String value) {
            addCriterion("SHENPI_REASON =", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonNotEqualTo(String value) {
            addCriterion("SHENPI_REASON <>", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonGreaterThan(String value) {
            addCriterion("SHENPI_REASON >", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonGreaterThanOrEqualTo(String value) {
            addCriterion("SHENPI_REASON >=", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonLessThan(String value) {
            addCriterion("SHENPI_REASON <", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonLessThanOrEqualTo(String value) {
            addCriterion("SHENPI_REASON <=", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonLike(String value) {
            addCriterion("SHENPI_REASON like", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonNotLike(String value) {
            addCriterion("SHENPI_REASON not like", value, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonIn(List<String> values) {
            addCriterion("SHENPI_REASON in", values, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonNotIn(List<String> values) {
            addCriterion("SHENPI_REASON not in", values, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonBetween(String value1, String value2) {
            addCriterion("SHENPI_REASON between", value1, value2, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andShenpiReasonNotBetween(String value1, String value2) {
            addCriterion("SHENPI_REASON not between", value1, value2, "shenpiReason");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateIsNull() {
            addCriterion("SHENPI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andShenpiDateIsNotNull() {
            addCriterion("SHENPI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andShenpiDateEqualTo(Date value) {
            addCriterion("SHENPI_DATE =", value, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateNotEqualTo(Date value) {
            addCriterion("SHENPI_DATE <>", value, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateGreaterThan(Date value) {
            addCriterion("SHENPI_DATE >", value, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SHENPI_DATE >=", value, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateLessThan(Date value) {
            addCriterion("SHENPI_DATE <", value, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateLessThanOrEqualTo(Date value) {
            addCriterion("SHENPI_DATE <=", value, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateIn(List<Date> values) {
            addCriterion("SHENPI_DATE in", values, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateNotIn(List<Date> values) {
            addCriterion("SHENPI_DATE not in", values, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateBetween(Date value1, Date value2) {
            addCriterion("SHENPI_DATE between", value1, value2, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andShenpiDateNotBetween(Date value1, Date value2) {
            addCriterion("SHENPI_DATE not between", value1, value2, "shenpiDate");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("APPLY_TYPE =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("APPLY_TYPE <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("APPLY_TYPE >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("APPLY_TYPE <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("APPLY_TYPE like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("APPLY_TYPE not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("APPLY_TYPE in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("APPLY_TYPE not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE not between", value1, value2, "applyType");
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