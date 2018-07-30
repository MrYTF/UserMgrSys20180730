package cn.edu.lingnan.usermgr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

import cn.edu.lingnan.common.exception.DaoException;
import cn.edu.lingnan.common.util.DBUtil;
import cn.edu.lingnan.usermgr.domain.userDto;
/**
 * userDao实现类
 * @author LiQi
 *
 */
public class userDaoImp implements userDao{
	/**
	 * 数据库连接
	 */
	private Connection connection;
	/**
	 * 构造方法
	 * @param connection 数据库连接
	 */
	public userDaoImp(Connection connection) {
		this.connection = connection;
		//System.out.println("^_^"+this.connection);
	}
	/**
	 * 用户登录
	 */
	public userDto login(String sname,String password) {
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		userDto dto = null;
		String sql = "select * from t_user where sname = ? and password = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, sname);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				dto = new userDto();
				dto.setSid(resultSet.getInt("sid"));
				dto.setSname(resultSet.getString("sname"));
				dto.setPassword(resultSet.getString("password"));
				dto.setGender(resultSet.getString("gender"));
				dto.setAge(resultSet.getInt("age"));
				dto.setPhone(resultSet.getString("phone"));
				dto.setBirth(resultSet.getTimestamp("birth"));
				dto.setPower(resultSet.getString("power"));
				dto.setStatus(resultSet.getInt("status"));
				//System.out.println("(~_*)"+dto);
			}
		} catch (SQLException e) {
			throw new DaoException("无法获取数据库连接......", e);
		}finally {
			DBUtil.closeStatement(resultSet, preparedStatement);
		}
		return dto;
	}
	/**
	 * 删除用户
	 * @param sid
	 * @return
	 */
	public boolean delUser(int sid){
		boolean flag = false;
		PreparedStatement statement = null;
		int num = 0;
		//String sql = "delete from t_user where sid = ?";
		String sql = "update t_user set status = 0 where sid = ?";
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, sid);
			num = statement.executeUpdate();
			if (num>0) {
				flag = true;
			}
		} catch (Exception e) {
			throw new DaoException("删除不成功",e);
		}finally {
			DBUtil.closeStatement(null, statement);
		}
		return flag;
	}
	/**
	 * 查询所有用户
	 * @return 返回容器vector
	 */
	public Vector<userDto> findAllUser() {
		Vector<userDto> dtos = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = "select * from t_user";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			dtos = new Vector<userDto>();
			while(resultSet.next()) {
				userDto dto = new userDto();
				dto.setSid(resultSet.getInt("sid"));
				dto.setSname(resultSet.getString("sname"));
				dto.setPassword(resultSet.getString("password"));
				dto.setGender(resultSet.getString("gender"));
				dto.setAge(resultSet.getInt("age"));
				dto.setPhone(resultSet.getString("phone"));
				dto.setBirth(resultSet.getTimestamp("birth"));
				dto.setPower(resultSet.getString("power"));
				dto.setStatus(resultSet.getInt("status"));
				dtos.add(dto);
			}
		} catch (SQLException e) {
			throw new DaoException("查询失败....",e);
		}finally {
			DBUtil.closeStatement(resultSet, preparedStatement);
		}
		return dtos;
	}
	
	/**
	 * 插入用户信息
	 * @return 返回布尔值
	 */
	public boolean insUser(String sname, String password, String gender, int age, String phone, Date birth, String power, int status) {
		boolean flag = false;
		int num = 0;
		PreparedStatement preparedStatement = null;
		String sql = "insert into t_user values(?,?,?,?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, sname);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, gender);
			preparedStatement.setInt(4, age);
			preparedStatement.setString(5, phone);
			preparedStatement.setDate(6, (java.sql.Date) birth);
			preparedStatement.setString(7, power);
			preparedStatement.setInt(8, status);
			num = preparedStatement.executeUpdate();
			if (flag) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			DBUtil.closeStatement(null, preparedStatement);
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
