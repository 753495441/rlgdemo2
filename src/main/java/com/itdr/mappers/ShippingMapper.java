package com.itdr.mappers;

import com.itdr.pojo.Shipping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    //
    Shipping selectByIdAndUid(@Param("shippingId") Integer shippingId, @Param("uid") Integer uid);

    //获取用户所有收货地址
    List<Shipping> selectByUid(Integer uid);
}