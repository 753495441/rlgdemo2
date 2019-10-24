package com.itdr.controllers.portal;

import com.itdr.common.Const;
import com.itdr.common.ServerResponse;
import com.itdr.pojo.Users;
import com.itdr.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/portal/address/")
public class AddressController {

    @Autowired
    AddressService addressService;

    //获取用户收货地址
    @RequestMapping("search.do")
    public ServerResponse login(HttpSession session) {
        //判断用户是否登录
        Users users = (Users) session.getAttribute(Const.LOGINUSER);
        if (users == null) {
            return ServerResponse.defeatedRS(Const.UsersEnum.NO_LOGIN.getCode(), Const.UsersEnum.NO_LOGIN.getDesc());
        }
        return addressService.addOne(users.getId());
    }
}
