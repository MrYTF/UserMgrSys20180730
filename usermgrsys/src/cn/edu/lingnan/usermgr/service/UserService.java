package cn.edu.lingnan.usermgr.service;
/**
 * user service类
 * @author LiQi
 *
 */

import cn.edu.lingnan.usermgr.domain.userDto;

public interface UserService {
	/**
	 * 用户登录
	 * @param sname 用户名
	 * @param password 密码
	 * @return 用户信息
	 */
	public userDto login(String sname, String password);
}
