package edu.faesp.framework.calculadora.exception;

public class CalculadoraException extends Exception{

	private static final long serialVersionUID = 1L;

	public CalculadoraException() {
		super();
	}

	public CalculadoraException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CalculadoraException(String message, Throwable cause) {
		super(message, cause);
	}

	public CalculadoraException(String message) {
		super(message);
	}

	public CalculadoraException(Throwable cause) {
		super(cause);
	}
}
