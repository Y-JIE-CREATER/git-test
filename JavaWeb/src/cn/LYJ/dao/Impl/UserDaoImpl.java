package cn.LYJ.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.LYJ.dao.UserDao;
import cn.LYJ.db.DbUtil;
import cn.LYJ.pojo.User;
/**
 * 
 * ����dbUtil����װjavaBean����
 * @author Lsir
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public User getUserById(int uid) {
		// TODO Auto-generated method stub
		User user = new User();
		DbUtil dbUtil = new DbUtil();
		String sql = "select * from t_user where uid = "+uid;
		ResultSet rs = dbUtil.executeQuery(sql);
		try {
			while(rs.next()) {
				user.setUid(uid);
				user.setUname(rs.getString("uname"));
				user.setPwd(rs.getString("pwd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		ArrayList<User> users = new ArrayList<User>();
		DbUtil dbUtil = new DbUtil();
		String sql = "select * from t_user";
		ResultSet rs = dbUtil.executeQuery(sql);
		try {
			while(rs.next()) {
				User user = new User();
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("uname"));
				user.setPwd(rs.getString("pwd"));
				users.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}

	@Override
	public boolean ifExit(User myuser) {
		DbUtil dbUtil = new DbUtil();
		String sql = "select * from t_user where uname='"+myuser.getUname()+" 'and pwd='"+myuser.getPwd()+"'";
		System.out.println(sql);
		ResultSet rs = dbUtil.executeQuery(sql);
		try {
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into t_user values("+"default,'"+user.getUname()+"','"+user.getPwd()+"')";
		System.out.println(sql);
		DbUtil dbUtil = new DbUtil();
		//
		int result = dbUtil.executeNoQuery(sql);
		return result;
	}

}
