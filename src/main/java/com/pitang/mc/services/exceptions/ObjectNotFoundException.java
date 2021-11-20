package com.pitang.mc.services.exceptions;

import ch.qos.logback.core.helpers.ThrowableToStringArray;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
