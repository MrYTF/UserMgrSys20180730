package cn.edu.lingnan.usermgr.service;

import java.sql.Connection;

import cn.edu.lingnan.common.constant.enumType;
import cn.edu.lingnan.common.dao.DaoFactory;
import cn.edu.lingnan.common.exception.ServiceException;
import cn.edu.lingnan.common.util.DBUtil;
import cn.edu.lingnan.usermgr.dao.userDao;
import cn.edu.lingnan.usermgr.domain.userDto;

/**
 * 用户service实例类
 * @author LiQi
 *
 */
public class UserServiceImp implements UserService{
	/**
	 * 在类内部创建唯一实例
	 */
	private static UserService userService = new UserServiceImp();
	/**
	 * 构造方法私有化
	 */
	private UserServiceImp() {
		
	}
	/**
	 * 获得用户service实例
	 * 提供对外访问的方法
	 * @return 返回实例对象
	 */
	public static UserService getInstance() {
		return userService;
	}
	/**
	 * 用户登录
	 * @param sname 用户名
	 * @param password 密码
	 * @return 返回对应用户信息
	 */
	public userDto login(String sname, String password) {
		Connection connection = null;
		userDto dto = null;
		try {
			connection = DBUtil.getconnection();
			userDao dao = (userDao) DaoFactory.getDao(connection, enumType.User_Dao);
			dto = dao.login(sname, password);
		} catch (Exception e) {
			throw new ServiceException("登录失败......", e);
		}finally {
			DBUtil.closeConnection(connection);
		}
		return dto;
	}
}
