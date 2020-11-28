package com.itbs.persistence.entity;

import java.util.Date;

public class TCenterPandianDetail {
    private Integer id;

    private String pandianId;

    private Integer pandianDetailId;

    private String pandianDetailCode;

    private Integer isHl;

    private Integer resourceId;

    private String resourceCode;

    private String locationCode;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPandianId() {
        return pandianId;
    }

    public void setPandianId(String pandianId) {
        this.pandianId = pandianId == null ? null : pandianId.trim();
    }

    public Integer getPandianDetailId() {
        return pandianDetailId;
    }

    public void setPandianDetailId(Integer pandianDetailId) {
        this.pandianDetailId = pandianDetailId;
    }

    public String getPandianDetailCode() {
        return pandianDetailCode;
    }

    public void setPandianDetailCode(String pandianDetailCode) {
        this.pandianDetailCode = pandianDetailCode == null ? null : pandianDetailCode.trim();
    }

    public Integer getIsHl() {
        return isHl;
    }

    public void setIsHl(Integer isHl) {
        this.isHl = isHl;
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

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}