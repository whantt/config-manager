package com.jzx.config.web.result;
/**
 * 返回消息
 * @author hncdyj123@163.com
 */
public class JsonMessage {
	/** 错误码 **/
	private int code = 200;
	/** 返回消息 **/
	private String message;
	/** 返回结果 **/
	private Object result;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}

}
