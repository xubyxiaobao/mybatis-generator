package com.xu.tao.dao;

import com.xu.tao.pojo.BaseSet;

public interface BaseSetMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BaseSet record);

    int insertSelective(BaseSet record);

    BaseSet selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BaseSet record);

    int updateByPrimaryKey(BaseSet record);
}