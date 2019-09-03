package com.liys.book.utils;

import lombok.Data;

/**
 * http请求返回格式
 * 
 * @title:ResponseBase
 * @author liys
 * @date 2019年7月22日 下午7:54:24
 * @version V1.0
 */
@Data
public class ResponseBase {
	// 响应code
	private Integer code;
	// 消息内容
	private String msg;
	// 返回data
	private Object data;
	// 返回总数
	private Integer count;

	public ResponseBase() {
		super();
	}

	public ResponseBase(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResponseBase(Integer code, String msg, Object data, Integer count) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.count = count;
	}

	// 返回错误，可以传msg
	public static ResponseBase setResultError(String msg) {
		return setResult(Constants.HTTP_RES_CODE_500, msg, null);
	}

	// 返回成功，可以传data值
	public static ResponseBase setResultSuccess(Object data) {
		return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data);
	}

	public static ResponseBase setResultSuccess(Object data, Integer count) {
		return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, data, count);
	}

	// 返回成功，沒有data值
	public static ResponseBase setResultSuccess() {
		return setResult(Constants.HTTP_RES_CODE_200, Constants.HTTP_RES_CODE_200_VALUE, null);
	}

	// 返回成功，沒有data值
	public static ResponseBase setResultSuccess(String msg) {
		return setResult(Constants.HTTP_RES_CODE_200, msg, null);
	}

	// 通用封装
	public static ResponseBase setResult(Integer code, String msg, Object data) {
		return new ResponseBase(code, msg, data);
	}

	// 通用封装
	public static ResponseBase setResult(Integer code, String msg, Object data,Integer count) {
		return new ResponseBase(code, msg, data,count);
	}

}
