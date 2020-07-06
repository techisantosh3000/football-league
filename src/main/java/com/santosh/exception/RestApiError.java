package com.santosh.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

public class RestApiError {
	private HttpStatus status;
	private String message;
	
	public RestApiError() {
		super();
	}
	public RestApiError(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "RestApiError [status=" + status + ", message=" + message + "]";
	}
	
}
