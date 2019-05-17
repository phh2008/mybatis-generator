package com.phh.dao;

import com.phh.domain.Bank;

public interface BankMapper {
    /**
     *
     * @mbg.generated 2019-03-25
     */
    int deleteByPrimaryKey(Long bankId);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int insert(Bank record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int insertSelective(Bank record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    Bank selectByPrimaryKey(Long bankId);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int updateByPrimaryKeySelective(Bank record);

    /**
     *
     * @mbg.generated 2019-03-25
     */
    int updateByPrimaryKey(Bank record);
}