package cn.edu.lingnan.common.exception;
/*
 * service异常类
 */
public class ServiceException extends RuntimeException{
	/**
	 * 默认的构造方法
	 */
	public ServiceException() {
		super();
	}
	/**
	 * 构造方法
	 * @param message 详细信息
	 * @param cause 异常原因
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * 构造方法
	 * @param message 详细信息
	 */
	public ServiceException(String message) {
		super(message);
	}
	/**
	 * 构造方法
	 * @param cause 异常原因
	 */
	public ServiceException(Throwable cause) {
		super(cause);
	}
	
}
