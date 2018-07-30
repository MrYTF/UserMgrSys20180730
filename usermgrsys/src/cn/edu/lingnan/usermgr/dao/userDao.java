package cn.edu.lingnan.usermgr.dao;

import java.util.Vector;

import cn.edu.lingnan.common.dao.BaseDao;
import cn.edu.lingnan.usermgr.domain.userDto;
/**
 * userDao接口类
 * @author LiQi
 *
 */
public interface userDao extends BaseDao {
	/**
	 * 用户登录
	 * @param sname 用户姓名
	 * @param password 用户密码
	 * @return 返回信息匹配的用户所有信息
	 */
	public userDto login(String sname,String password);
	
	/**
	 * 查询所有用户
	 * @return 返回所有用户信息的集合
	 */
	public Vector<userDto> findAllUser();
	
	/**
	 * 根据id删除用户
	 * @param sid 用户id
	 * @return 返回布尔值
	 */
	public boolean delUser(int sid);
}
