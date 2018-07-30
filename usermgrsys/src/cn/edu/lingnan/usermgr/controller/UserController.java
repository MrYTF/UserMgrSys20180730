package cn.edu.lingnan.usermgr.controller;

import cn.edu.lingnan.usermgr.domain.userDto;
import cn.edu.lingnan.usermgr.service.UserService;
import cn.edu.lingnan.usermgr.service.UserServiceImp;

public class UserController {
	//声明用户service接口对象，用于业务处理
	UserService service = UserServiceImp.getInstance();
	public userDto doLogin(String sname, String password) {
		userDto dto = null;
		try {
			//调用service接口中的login方法进行用户登录操作
			dto = service.login(sname, password);
		} catch (Exception e) {
			System.out.println("doLogin操作失败....");
			e.printStackTrace();
		}
		return dto;
	}
}
