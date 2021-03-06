package com.itdr.mappers;

import com.itdr.pojo.PayInFo;
import org.apache.ibatis.annotations.Mapper;

public interface PayInFoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayInFo record);

    int insertSelective(PayInFo record);

    PayInFo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayInFo record);

    int updateByPrimaryKey(PayInFo record);
}