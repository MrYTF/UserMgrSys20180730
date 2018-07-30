package cn.edu.lingnan.usermgr.view;

import cn.edu.lingnan.usermgr.domain.userDto;

public class NormalFrame extends IndexFrame{
	/**
	 * 登录成功主页面
	 */
	public void show(userDto dto) {
		System.out.println("-------欢迎回来^_^----------");
		System.out.println(dto.getSname()+"您好！	您的权限是："+dto.getPower());
		System.out.println("-------------------------");
		System.out.println(".......查询个人信息-->1.......");
		System.out.println(".......修改个人信息-->2.......");
		System.out.println(".......退出登录---->3.......");
		System.out.println("-------------------------");
		
	}
}
