package com.itbs.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TCenterResource {
    private Integer id;

    private Integer resourceId;

    private String resourceCode;

    private String resourceName;

    private Date inaccountDate;

    private BigDecimal oriValue;

    private BigDecimal netValue;

    private String accrualofdePreciation;

    private Integer limitYear;

    private Integer keeperId;

    private String keeperName;

    private String responsibilityCenter;

    private String spec;

    private String liocation;

    private String pandianSit;

    private Object otherInfo;

    private Integer status;

    private Integer skuId;

    private Integer spuId;

    private Integer userId;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode == null ? null : resourceCode.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public Date getInaccountDate() {
        return inaccountDate;
    }

    public void setInaccountDate(Date inaccountDate) {
        this.inaccountDate = inaccountDate;
    }

    public BigDecimal getOriValue() {
        return oriValue;
    }

    public void setOriValue(BigDecimal oriValue) {
        this.oriValue = oriValue;
    }

    public BigDecimal getNetValue() {
        return netValue;
    }

    public void setNetValue(BigDecimal netValue) {
        this.netValue = netValue;
    }

    public String getAccrualofdePreciation() {
        return accrualofdePreciation;
    }

    public void setAccrualofdePreciation(String accrualofdePreciation) {
        this.accrualofdePreciation = accrualofdePreciation == null ? null : accrualofdePreciation.trim();
    }

    public Integer getLimitYear() {
        return limitYear;
    }

    public void setLimitYear(Integer limitYear) {
        this.limitYear = limitYear;
    }

    public Integer getKeeperId() {
        return keeperId;
    }

    public void setKeeperId(Integer keeperId) {
        this.keeperId = keeperId;
    }

    public String getKeeperName() {
        return keeperName;
    }

    public void setKeeperName(String keeperName) {
        this.keeperName = keeperName == null ? null : keeperName.trim();
    }

    public String getResponsibilityCenter() {
        return responsibilityCenter;
    }

    public void setResponsibilityCenter(String responsibilityCenter) {
        this.responsibilityCenter = responsibilityCenter == null ? null : responsibilityCenter.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getLiocation() {
        return liocation;
    }

    public void setLiocation(String liocation) {
        this.liocation = liocation == null ? null : liocation.trim();
    }

    public String getPandianSit() {
        return pandianSit;
    }

    public void setPandianSit(String pandianSit) {
        this.pandianSit = pandianSit == null ? null : pandianSit.trim();
    }

    public Object getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(Object otherInfo) {
        this.otherInfo = otherInfo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
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
}