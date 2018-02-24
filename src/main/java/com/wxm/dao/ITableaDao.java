package com.wxm.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wxm.domain.Tablea;
@Mapper
public interface ITableaDao {
    int deleteByPrimaryKey(Long id);

    int insert(Tablea record);

    int insertSelective(Tablea record);

    Tablea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tablea record);

    int updateByPrimaryKey(Tablea record);
}