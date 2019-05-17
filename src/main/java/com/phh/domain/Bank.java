package com.phh.domain;

import java.util.Date;

public class Bank {
    /**
     * 主键ID
     */
    private Long bankId;

    /**
     * 编号
     */
    private String code;

    /**
     * 华夏账户特有子行号
     */
    private String hxbSubCode;

    /**
     * 银行名称
     */
    private String name;

    /**
     * 支行名称
     */
    private String branchName;

    /**
     * 备注
     */
    private String note;

    /**
     * 排序
     */
    private Integer sn;

    /**
     * 逻辑状态：1-正常，0-删除
     */
    private Short state;

    /**
     * 物理状态：1-正常，0-删除
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
     * 主键ID
     * @return bankId 主键ID
     */
    public Long getBankId() {
        return bankId;
    }

    /**
     * 主键ID
     * @param bankId 主键ID
     */
    public void setBankId(Long bankId) {
        this.bankId = bankId;
    }

    /**
     * 编号
     * @return code 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 编号
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 华夏账户特有子行号
     * @return hxbSubCode 华夏账户特有子行号
     */
    public String getHxbSubCode() {
        return hxbSubCode;
    }

    /**
     * 华夏账户特有子行号
     * @param hxbSubCode 华夏账户特有子行号
     */
    public void setHxbSubCode(String hxbSubCode) {
        this.hxbSubCode = hxbSubCode == null ? null : hxbSubCode.trim();
    }

    /**
     * 银行名称
     * @return name 银行名称
     */
    public String getName() {
        return name;
    }

    /**
     * 银行名称
     * @param name 银行名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 支行名称
     * @return branchName 支行名称
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 支行名称
     * @param branchName 支行名称
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    /**
     * 备注
     * @return note 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 排序
     * @return sn 排序
     */
    public Integer getSn() {
        return sn;
    }

    /**
     * 排序
     * @param sn 排序
     */
    public void setSn(Integer sn) {
        this.sn = sn;
    }

    /**
     * 逻辑状态：1-正常，0-删除
     * @return state 逻辑状态：1-正常，0-删除
     */
    public Short getState() {
        return state;
    }

    /**
     * 逻辑状态：1-正常，0-删除
     * @param state 逻辑状态：1-正常，0-删除
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 物理状态：1-正常，0-删除
     * @return valid 物理状态：1-正常，0-删除
     */
    public Short getValid() {
        return valid;
    }

    /**
     * 物理状态：1-正常，0-删除
     * @param valid 物理状态：1-正常，0-删除
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
}