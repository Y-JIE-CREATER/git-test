package cn.LYJ.service;

import java.util.ArrayList;

import cn.LYJ.pojo.User;
/**
 * 
 * service�㣬�������ݵ��߼������Լ���Dao���ת�Ӳ���
 * @author Lsir
 *
 */
public interface LoginService {
	public User getUserById(int uid);
	public ArrayList<User> getAllUsers();
	
	public boolean ifExit(User myuser);
	
	public int insertUser(User user);
}
