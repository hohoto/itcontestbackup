package com.itbs.persistence.entity;

import java.util.Date;

public class TCenterPandian {
    private Integer id;

    private String pandianCode;

    private Date planBeginDate;

    private Date planEndDate;

    private Date actualBeginDate;

    private Date actualEndDate;

    private String accrualofdePreciation;

    private Integer personCompanyId;

    private String personCompanyName;

    private Integer personDepartmentId;

    private String personDepartmentName;

    private Integer personUserId;

    private String personUserName;

    private Integer spuId;

    private Integer planQty;

    private Integer actualQty;

    private Integer status;

    private String locationCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPandianCode() {
        return pandianCode;
    }

    public void setPandianCode(String pandianCode) {
        this.pandianCode = pandianCode == null ? null : pandianCode.trim();
    }

    public Date getPlanBeginDate() {
        return planBeginDate;
    }

    public void setPlanBeginDate(Date planBeginDate) {
        this.planBeginDate = planBeginDate;
    }

    public Date getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Date getActualBeginDate() {
        return actualBeginDate;
    }

    public void setActualBeginDate(Date actualBeginDate) {
        this.actualBeginDate = actualBeginDate;
    }

    public Date getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Date actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public String getAccrualofdePreciation() {
        return accrualofdePreciation;
    }

    public void setAccrualofdePreciation(String accrualofdePreciation) {
        this.accrualofdePreciation = accrualofdePreciation == null ? null : accrualofdePreciation.trim();
    }

    public Integer getPersonCompanyId() {
        return personCompanyId;
    }

    public void setPersonCompanyId(Integer personCompanyId) {
        this.personCompanyId = personCompanyId;
    }

    public String getPersonCompanyName() {
        return personCompanyName;
    }

    public void setPersonCompanyName(String personCompanyName) {
        this.personCompanyName = personCompanyName == null ? null : personCompanyName.trim();
    }

    public Integer getPersonDepartmentId() {
        return personDepartmentId;
    }

    public void setPersonDepartmentId(Integer personDepartmentId) {
        this.personDepartmentId = personDepartmentId;
    }

    public String getPersonDepartmentName() {
        return personDepartmentName;
    }

    public void setPersonDepartmentName(String personDepartmentName) {
        this.personDepartmentName = personDepartmentName == null ? null : personDepartmentName.trim();
    }

    public Integer getPersonUserId() {
        return personUserId;
    }

    public void setPersonUserId(Integer personUserId) {
        this.personUserId = personUserId;
    }

    public String getPersonUserName() {
        return personUserName;
    }

    public void setPersonUserName(String personUserName) {
        this.personUserName = personUserName == null ? null : personUserName.trim();
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Integer getPlanQty() {
        return planQty;
    }

    public void setPlanQty(Integer planQty) {
        this.planQty = planQty;
    }

    public Integer getActualQty() {
        return actualQty;
    }

    public void setActualQty(Integer actualQty) {
        this.actualQty = actualQty;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }
}