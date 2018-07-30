package cn.edu.lingnan.common.exception;
/**
 * service异常类
 */
public class EmailException extends ServiceException{
	/**
	 * 默认构造方法
	 */
	public EmailException() {
		super();
	}
	/**
	 * 构造方法
	 * @param message 详细信息
	 * @param cause 异常原因
	 */
	public EmailException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * 构造方法
	 * @param message 详细信息
	 */
	public EmailException(String message) {
		super(message);
	}
	/**
	 * 构造方法
	 * @param cause 异常原因
	 */
	public EmailException(Throwable cause) {
		super(cause);
	}
	
}
