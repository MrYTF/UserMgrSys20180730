package cn.edu.lingnan.common.exception;
/**
 * service异常类
 * @author LiQi
 *
 */
public class DateException extends ServiceException{
	/**
	 * 默认构造方法
	 */
	public DateException() {
		super();
	}
	/**
	 * 构造方法
	 * @param message 详细信息
	 * @param cause 异常原因
	 */
	public DateException(String message, Throwable cause) {
		super(message, cause);
	}
	/**
	 * 构造方法
	 * @param message 详细信息
	 */
	public DateException(String message) {
		super(message);
	}
	/**
	 * 构造方法
	 * @param cause 异常原因
	 */
	public DateException(Throwable cause) {
		super(cause);
	}
	
}
