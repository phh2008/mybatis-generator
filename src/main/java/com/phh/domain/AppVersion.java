package com.phh.domain;

import java.util.Date;

public class AppVersion {
    /**
     * 主键ID
     */
    private Long verId;

    /**
     * 应用类型：1-采购商版APP
     */
    private Short appType;

    /**
     * 平台类型：1-ios手机，2-android手机
     */
    private Short platType;

    /**
     * 版本号
     */
    private Integer versionCode;

    /**
     * 版本名称
     */
    private String versionName;

    /**
     * 强制更新：0-否，1-是
     */
    private Short forced;

    /**
     * 下载地址
     */
    private String download;

    /**
     * 逻辑状态
     */
    private Short state;

    /**
     * 物理状态
     */
    private Short valid;

    /**
     * 创建者
     */
    private Long createId;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改者
     */
    private Long modifyId;

    /**
     * 修改日期
     */
    private Date modifyDate;

    /**
     * 更新内容
     */
    private String content;

    /**
     * 主键ID
     * @return verId 主键ID
     */
    public Long getVerId() {
        return verId;
    }

    /**
     * 主键ID
     * @param verId 主键ID
     */
    public void setVerId(Long verId) {
        this.verId = verId;
    }

    /**
     * 应用类型：1-采购商版APP
     * @return appType 应用类型：1-采购商版APP
     */
    public Short getAppType() {
        return appType;
    }

    /**
     * 应用类型：1-采购商版APP
     * @param appType 应用类型：1-采购商版APP
     */
    public void setAppType(Short appType) {
        this.appType = appType;
    }

    /**
     * 平台类型：1-ios手机，2-android手机
     * @return platType 平台类型：1-ios手机，2-android手机
     */
    public Short getPlatType() {
        return platType;
    }

    /**
     * 平台类型：1-ios手机，2-android手机
     * @param platType 平台类型：1-ios手机，2-android手机
     */
    public void setPlatType(Short platType) {
        this.platType = platType;
    }

    /**
     * 版本号
     * @return versionCode 版本号
     */
    public Integer getVersionCode() {
        return versionCode;
    }

    /**
     * 版本号
     * @param versionCode 版本号
     */
    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * 版本名称
     * @return versionName 版本名称
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * 版本名称
     * @param versionName 版本名称
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    /**
     * 强制更新：0-否，1-是
     * @return forced 强制更新：0-否，1-是
     */
    public Short getForced() {
        return forced;
    }

    /**
     * 强制更新：0-否，1-是
     * @param forced 强制更新：0-否，1-是
     */
    public void setForced(Short forced) {
        this.forced = forced;
    }

    /**
     * 下载地址
     * @return download 下载地址
     */
    public String getDownload() {
        return download;
    }

    /**
     * 下载地址
     * @param download 下载地址
     */
    public void setDownload(String download) {
        this.download = download == null ? null : download.trim();
    }

    /**
     * 逻辑状态
     * @return state 逻辑状态
     */
    public Short getState() {
        return state;
    }

    /**
     * 逻辑状态
     * @param state 逻辑状态
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 物理状态
     * @return valid 物理状态
     */
    public Short getValid() {
        return valid;
    }

    /**
     * 物理状态
     * @param valid 物理状态
     */
    public void setValid(Short valid) {
        this.valid = valid;
    }

    /**
     * 创建者
     * @return createId 创建者
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 创建者
     * @param createId 创建者
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 创建日期
     * @return createDate 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 修改者
     * @return modifyId 修改者
     */
    public Long getModifyId() {
        return modifyId;
    }

    /**
     * 修改者
     * @param modifyId 修改者
     */
    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    /**
     * 修改日期
     * @return modifyDate 修改日期
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 修改日期
     * @param modifyDate 修改日期
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 更新内容
     * @return content 更新内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 更新内容
     * @param content 更新内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}