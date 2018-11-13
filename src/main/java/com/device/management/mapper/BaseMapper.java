package com.device.management.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<T, D> {
    long countByExample(D example);

    int deleteByExample(D example);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(D example);

    int updateByExampleSelective(@Param("record") T record, @Param("example") D example);

    int updateByExample(@Param("record") T record, @Param("example") D example);
}
