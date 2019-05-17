package com.phh.dao;

import com.phh.domain.AppVersion;

public interface AppVersionMapper {
    /**
     *
     * @mbg.generated 2019-03-25
     */
    int deleteByPrimaryKey(Long verId);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int insert(AppVersion record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int insertSelective(AppVersion record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    AppVersion selectByPrimaryKey(Long verId);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int updateByPrimaryKeySelective(AppVersion record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int updateByPrimaryKeyWithBLOBs(AppVersion record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int updateByPrimaryKey(AppVersion record);
}