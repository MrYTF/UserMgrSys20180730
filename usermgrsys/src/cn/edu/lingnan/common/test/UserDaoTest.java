package cn.edu.lingnan.common.test;

import java.sql.Connection;
import java.util.Vector;

import org.junit.Test;

import cn.edu.lingnan.common.constant.enumType;
import cn.edu.lingnan.common.dao.DaoFactory;
import cn.edu.lingnan.common.util.DBUtil;
import cn.edu.lingnan.usermgr.dao.userDao;
import cn.edu.lingnan.usermgr.dao.userDaoImp;
import cn.edu.lingnan.usermgr.domain.userDto;

public class UserDaoTest {

	@Test
	public void testLogin() {
			Connection connection = DBUtil.getconnection();
			userDto dto = new userDto();
			userDao dao = new userDaoImp(connection);
			//userDao dao = (userDao) DaoFactory.getDao(connection, enumType.User_Dao);
			dto = dao.login("凌凌柒", "12345");
			System.out.println(dto);
//		userDaoImp daoImp = (userDaoImp)DaoFactory.getDao(connection, enumType.User_Dao);
//		daoImp.name();
	}
	
	@Test
	public void testFindAllUser() {
			Connection connection = DBUtil.getconnection();
			userDao dao = new userDaoImp(connection);
			//userDao dao = (userDao) DaoFactory.getDao(connection, enumType.User_Dao);
			Vector<userDto> dtos = dao.findAllUser();
			for(int i=0;i<dtos.size();i++) {
				System.out.println(dtos.get(i));
			}	
	}
	@Test
	public void testDelUser() {
		boolean flag = false;
		Connection connection = DBUtil.getconnection();
		userDao dao = new userDaoImp(connection);
		flag = dao.delUser(1);
		System.out.println(flag);
	}
}
