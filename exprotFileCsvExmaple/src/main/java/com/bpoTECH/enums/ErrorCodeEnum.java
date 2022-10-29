package com.bpoTECH.enums;

public enum ErrorCodeEnum {

	L404("not found"), L200("success");
	
	private String message;

	ErrorCodeEnum(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
