package com.itdr.services.impl;

import com.itdr.common.ServerResponse;
import com.itdr.mappers.ShippingMapper;
import com.itdr.pojo.Shipping;
import com.itdr.pojo.vo.ShippingVO;
import com.itdr.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private ShippingMapper shippingMapper;

    //查询用户收货地址
    @Override
    public ServerResponse addOne(Integer uid) {
        List<Shipping> shippingList = shippingMapper.selectByUid(uid);
        return ServerResponse.successRS(shippingList);
    }
}
