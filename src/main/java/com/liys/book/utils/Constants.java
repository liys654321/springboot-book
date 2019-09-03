package com.liys.book.utils;

public interface Constants {
	// 响应code
	String HTTP_RES_CODE_NAME = "code";
	// 响应msg
	String HTTP_RES_CODE_MSG = "msg";
	// 错误响应值
	String HTTP_RES_VALUE = "操作失败";
	// 响应data
	String HTTP_RES_CODE_DATA = "data";
	// 响应请求成功
	String HTTP_RES_CODE_200_VALUE = "success";
	// 系统错误
	String HTTP_RES_CODE_500_VALUE = "fial";
	// 响应请求成功code
	Integer HTTP_RES_CODE_200 = 200;
	// 系统错误
	Integer HTTP_RES_CODE_500 = 500;
	// redis存储的时间
	Long MEMBER_TIME_OUT = 60 * 60 * 30L;
	// token名称
	String TOKEN_NAME = "smartirrigation_token";
	// cookie过期时间
	Integer COOKIE_OUT_TIME = 30 * 60;
	
	// 网关名称
	String GATEWAYNAME = "qhzssygateway";
	// 登录失败信息提示
	String LOGINERRORMSG = "用户名或密码有误！";
	// 登录失败信息提示
	String RESTLOGINERRORMSG = "用户名或密码有误！";
	// token不能为空
	String TOKENNOTNULL = "token不能为空!";
	// token无效
	String TOKENINVALID = "token无效!";
	// token过期
	String TOKENEXPIRE = "token过期!";
	// 密码加密密钥
	String PASSWORDKEY = "qhzssypasswordkey";
	// redis消息队列名称
	String REDISMESSAGETOPIC = "usergetpermission";
	// 操作成功
	String SUCCESS = "操作成功";
	// 操作成功
	String ERROR = "操作失败";
	// 渠道编号总干渠编号CT010000000000000
	String MASTERCODE = "CT010000000000000";

}
