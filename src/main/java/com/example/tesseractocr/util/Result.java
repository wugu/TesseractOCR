package com.example.tesseractocr.util;


public class Result<T> {

	private int code;
	private String msg;
	private T data;

	public Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Result(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
	}
}
