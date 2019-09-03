package com.liys.book.mapper;


import com.liys.book.domain.BConf;
import org.apache.ibatis.annotations.Param;

public interface BConfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BConf record);

    int insertSelective(BConf record);

    BConf selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(BConf record);

    int updateByPrimaryKey(BConf record);
}