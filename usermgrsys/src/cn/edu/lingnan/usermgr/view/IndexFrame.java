package cn.edu.lingnan.usermgr.view;
/**
 * 页面显示
 * @author LiQi
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.edu.lingnan.usermgr.controller.UserController;
import cn.edu.lingnan.usermgr.domain.userDto;

public class IndexFrame implements BaseFrame{
	
	/**
	 * 登录页面
	 */
	@Override
	public void show() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = -1;
		//循环操作
		while(true) {
			//用户登录和注册页面
			System.out.println("-------欢迎使用用户管理系统-----");
			System.out.println(".........登录-->1.........");
			System.out.println(".........注册-->2.........");
			System.out.println(".........退出-->3.........");
			System.out.println("------------------------");
			System.out.println("请输入：");
			
			while(true) {
				try {
					i = Integer.parseInt(br.readLine());
					break;
				} catch (Exception e) {
					System.out.println("输入错误，请输入1-3数字");
					System.out.println("请重新输入：");
				}
			}
			/**
			 * 判断用户输入的值
			 */
			switch(i) {
			case 1: 
				this.loginShow();
				break;
			case 2:
				this.addShow();
				break;
			case 3:
				System.out.println("感谢您的使用....");
				System.exit(0);
			default:
				System.out.println("输入错误，请重新输入...");
			}
			break;
		}
	
	}
	public void loginShow() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--------用户登录界面--------");
		while(true) {
		System.out.println("请输入您的用户名：");
		try {
			String sname = br.readLine();
			System.out.println("请输入您的密码：");
			String password = br.readLine();
			UserController controller = new UserController();
			userDto dto = controller.doLogin(sname, password);
			if (dto != null) {
				System.out.println("登录成功....");
				System.out.println("-----------------------");
				if ("管理员".equals(dto.getPower())) {
					AdminFrame adminFrame = new AdminFrame();
					adminFrame.show(dto);
				}else {
					NormalFrame frame = new NormalFrame();
					frame.show(dto);
				}
				break;
			}
			else {
				System.out.println("登录失败....");
				System.out.println("用户名或密码错误...");
				System.out.println("-----------------------");
			}
		} catch (IOException e) {
			System.out.println("输入不正确，请重新输入....");
			e.printStackTrace();
		}
		}
	}
	@Override
	public void addShow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchShow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShow() {
		// TODO Auto-generated method stub
		
	}
	
}
