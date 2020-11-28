package com.itbs.persistence.entity;

import java.util.Date;

public class TDdApply {
    private Integer id;

    private String applyCode;

    private Integer companyId;

    private String companyName;

    private Integer departmentId;

    private String departmentName;

    private Integer userId;

    private String userName;

    private Integer spuId;

    private Integer skuId;

    private Integer resourceId;

    private String yongTu;

    private Integer status;

    private Integer shenPiCompanyId;

    private String shenPiCompanyName;

    private Integer shenPiDepartmentId;

    private String shenPiDepartmentName;

    private Integer shenPiUserId;

    private String shenPiUserName;

    private String shenpiReason;

    private Date applyDate;

    private Date shenpiDate;

    private String applyType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getYongTu() {
        return yongTu;
    }

    public void setYongTu(String yongTu) {
        this.yongTu = yongTu == null ? null : yongTu.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getShenPiCompanyId() {
        return shenPiCompanyId;
    }

    public void setShenPiCompanyId(Integer shenPiCompanyId) {
        this.shenPiCompanyId = shenPiCompanyId;
    }

    public String getShenPiCompanyName() {
        return shenPiCompanyName;
    }

    public void setShenPiCompanyName(String shenPiCompanyName) {
        this.shenPiCompanyName = shenPiCompanyName == null ? null : shenPiCompanyName.trim();
    }

    public Integer getShenPiDepartmentId() {
        return shenPiDepartmentId;
    }

    public void setShenPiDepartmentId(Integer shenPiDepartmentId) {
        this.shenPiDepartmentId = shenPiDepartmentId;
    }

    public String getShenPiDepartmentName() {
        return shenPiDepartmentName;
    }

    public void setShenPiDepartmentName(String shenPiDepartmentName) {
        this.shenPiDepartmentName = shenPiDepartmentName == null ? null : shenPiDepartmentName.trim();
    }

    public Integer getShenPiUserId() {
        return shenPiUserId;
    }

    public void setShenPiUserId(Integer shenPiUserId) {
        this.shenPiUserId = shenPiUserId;
    }

    public String getShenPiUserName() {
        return shenPiUserName;
    }

    public void setShenPiUserName(String shenPiUserName) {
        this.shenPiUserName = shenPiUserName == null ? null : shenPiUserName.trim();
    }

    public String getShenpiReason() {
        return shenpiReason;
    }

    public void setShenpiReason(String shenpiReason) {
        this.shenpiReason = shenpiReason == null ? null : shenpiReason.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getShenpiDate() {
        return shenpiDate;
    }

    public void setShenpiDate(Date shenpiDate) {
        this.shenpiDate = shenpiDate;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }
}