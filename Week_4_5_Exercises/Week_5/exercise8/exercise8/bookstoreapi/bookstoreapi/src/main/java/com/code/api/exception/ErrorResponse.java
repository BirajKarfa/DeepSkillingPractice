package com.code.api.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class ErrorResponse {
    private final int statusCode;
    private final String message;
	public int getStatusCode() {
		return statusCode;
	}
	public String getMessage() {
		return message;
	}
	public ErrorResponse(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}
    
    
}
