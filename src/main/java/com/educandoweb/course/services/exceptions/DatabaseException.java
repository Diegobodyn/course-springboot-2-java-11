package com.educandoweb.course.services.exceptions;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 7588023717060956015L;
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
