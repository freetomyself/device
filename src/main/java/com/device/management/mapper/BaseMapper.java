package com.device.management.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<T, E> {
    long countByExample(E example);

    int deleteByExample(E example);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(E example);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);
}
