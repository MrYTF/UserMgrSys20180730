package cn.edu.lingnan.usermgr.view;

import cn.edu.lingnan.usermgr.domain.userDto;

/**
 * 管理员页面
 * @author LiQi
 *
 */
public class AdminFrame extends NormalFrame{
	/**
	 * 登录成功主页面
	 */
	public void show(userDto dto) {
		System.out.println("-------欢迎回来^_^----------");
		System.out.println(dto.getSname()+"您好！	您的权限是："+dto.getPower());
		System.out.println("-------------------------");
		System.out.println(".......查询用户信息-->1.......");
		System.out.println(".......修改用户信息-->3.......");
		System.out.println(".......添加新用户--->2.......");
		System.out.println(".......删除用户---->4.......");
		System.out.println(".......退出登录---->5.......");
		System.out.println("-------------------------");
	}
	/**
	 * 添加用户页面
	 */
	public void addShow() {
		
	}
	
}
