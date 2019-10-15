package com.itdr.common;

public class Const {
    public static final String LOGINUSER = "login_user";
    public static final String TRADE_SUCCESS = "TRADE_SUCCESS";
    public static final String AUTOLOGINTOKEN = "autoLoginToken";
    public static final String JESSESSIONID_COOKIE = "JESSESSIONID_COOKIE";
    public static final String EMAIIL = "email";
    public static final String USERNAME = "username";
    public static final String TOKEN = "token_";
    /*
     * 成功时通用状态码
     * */
    public static final int SUCCESS = 0;

    /*
     * 失败时通用状态码
     * */
    public static final int ERROR = 100;

    public interface Cart {
        String LIMITQUANTITYSUCCESS = "LIMIT_NUM_SUCCESS";
        String LIMITQUANTITYFAILED = "LIMIT_NUM_FAILED";
        Integer CHECK = 1;
        Integer UNCHECK = 0;
    }

    /*用户模块*/
    public enum UsersEnum {
        //用户登录
        ERROR_PASSWORD(1, "密码错误"),
        EMPTY_USER(100, "用户名不能为空"),
        EMPTY_PASSWORD(100, "密码不能为空"),
        NO_USER(101, "用户名不存在"),
        //用户注册,检查用户名是否有效
        REPEAT_UESR(1, "用户已存在"),
        REPEAT_EMAIL(2, "邮箱已注册"),
        EMPTY_INFORMATION(100, "注册信息不能为空"),
        //获取登录用户信息,登录状态更新个人信息
        NO_LOGIN(1, "用户未登录，无法获取当前用户信息"),
        //提交问题答案
        ERROR_ANSWER(1, "问题答案错误"),
        EMPTY_QUESTION(100, "问题不能为空"),
        EMPTY_ANSWER(100, "答案不能为空"),
        //忘记密码的重设密码
        ERROR_CHANGE(1, "修改密码操作失败"),
        TIMEOUT_TOKEN(103, "token已经失效"),
        ERROR_TOKEN(104, "非法的token"),
        //登录状态中重置密码
        ERROR_PASSWORDOLD(1, "旧密码输入错误"),
        //获取当前登录用户的详细信息
        EXIT(10, "用户未登录，无法获取当前用户信息,status=10强制退出"),
        //退出登录
        ERROR_SERVER(1, "服务端异常");
        //状态信息

        //状态码和状态信息
        private int code;
        private String desc;

        private UsersEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /*购物车模块*/
    public enum CartEnum {
        NO_CART(3, "商品不存在"),
        EMPTY_NUM(9, "参数不能为空"),
        ERROR_UPDATE(2, "更新数据失败"),
        EMPTY_CART(1, "还没有选中任何商品哦~");
        private int code;
        private String desc;

        private CartEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum PaymentPlatformEnum {

        ALIPAY(1, "支付宝"),
        ALIPAY_FALSE(301, "支付宝生成订单失败"),
        VERIFY_SIGNATURE_FLASE(302, "支付宝验签失败"),
        VERIFY_ORDER_FALSE(303, "不是本商品的订单"),
        REPEAT_USEALIPAY(304, "支付宝重复调用"),
        SAVEPAYMSG_FALSE(305, "支付信息保存失败"),
        EMPTY_ALIPAY(7, "要支付的订单不存在"),
        ERROR_USER_CART(7, "订单和用户不匹配"),
        ERROR_CART(7, "要支付的订单不是未付款状态");
        private int code;
        private String desc;

        private PaymentPlatformEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

//    public enum RoleEnum{
//        ROLE_ADMIN(0,"管理员"),
//        ROLE_CUSTOMER(1,"普通用户");
//
//        private int code;
//        private String desc;
//
//        private RoleEnum(int code,String desc){
//            this.code = code;
//            this.desc = desc;
//        }
//        public int getCode() {
//            return code;
//        }
//
//        public void setCode(int code) {
//            this.code = code;
//        }
//
//        public String getDesc() {
//            return desc;
//        }
//
//        public void setDesc(String desc) {
//            this.desc = desc;
//        }
//
//    }


}
