package cn.edu.lingnan.common.exception;
/**
 * service异常类
 * @author LiQi
 *
 */
public class DaoException extends RuntimeException{
	
	/**
	 * 默认的构造方法
	 */
	public DaoException() {
		super();
	}
	/**
	 * 构造方法
	 * @param message 带详细信息
	 */
	public DaoException(String message) {
		super(message);
	}
	/**
	 * 构造方法
	 * @param cause 异常原因
	 */
	public DaoException(Throwable cause) {
		super(cause);
	}
	/**
	 * 构造方法
	 * @param message 带详细信息
	 * @param cause 异常原因
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

}
