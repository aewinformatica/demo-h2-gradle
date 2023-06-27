package com.example.demo.service.exception;

public class UserAlreadyRegisteredException extends RuntimeException {

	public UserAlreadyRegisteredException(String msg) {
		super(msg);
	}

	private static final long serialVersionUID = 1L;
}