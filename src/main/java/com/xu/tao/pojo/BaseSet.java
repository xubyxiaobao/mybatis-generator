package com.xu.tao.pojo;

import java.util.Date;

public class BaseSet {
    private Short id;

    private String appId;

    private String appSecret;

    private Date createDate;

    private Date updateDate;

    private String mark;

    private Short orgId;

    private Short status;

    private String token;

    private String wxId;

    public BaseSet(Short id, String appId, String appSecret, Date createDate, Date updateDate, String mark, Short orgId, Short status, String token, String wxId) {
        this.id = id;
        this.appId = appId;
        this.appSecret = appSecret;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.mark = mark;
        this.orgId = orgId;
        this.status = status;
        this.token = token;
        this.wxId = wxId;
    }

    public BaseSet() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Short getOrgId() {
        return orgId;
    }

    public void setOrgId(Short orgId) {
        this.orgId = orgId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId == null ? null : wxId.trim();
    }
}