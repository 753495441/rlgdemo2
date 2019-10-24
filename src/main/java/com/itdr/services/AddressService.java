package com.itdr.services;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.Users;

public interface AddressService {

    //查询用户收货地址
    ServerResponse addOne(Integer uid);
}
