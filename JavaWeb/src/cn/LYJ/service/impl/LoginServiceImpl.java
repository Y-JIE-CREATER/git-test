package cn.LYJ.service.impl;

import java.util.ArrayList;

import cn.LYJ.dao.UserDao;
import cn.LYJ.dao.Impl.UserDaoImpl;
import cn.LYJ.pojo.User;
import cn.LYJ.service.LoginService;

public class LoginServiceImpl implements LoginService {
	//��Ϊ˽�����ԣ�ֻ�б�����Է���
	private UserDao userDao = new UserDaoImpl();
	@Override
	public User getUserById(int uid) {
		return userDao.getUserById(uid);
	}

	@Override
	public ArrayList<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public boolean ifExit(User myuser) {
		
		return userDao.ifExit(myuser);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return  userDao.insertUser(user);
	}

}
