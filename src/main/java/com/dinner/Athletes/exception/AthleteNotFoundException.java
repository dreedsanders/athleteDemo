package com.dinner.Athletes.exception;

public class AthleteNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AthleteNotFoundException(String message) {
		super(message);
	}

}
