package cn.LYJ.dao;

import java.util.ArrayList;
import cn.LYJ.pojo.User;

public interface UserDao {
	
	public User getUserById(int uid);
	
	public ArrayList<User> getAllUsers();
	
	public boolean ifExit(User myuser);

	public int insertUser(User user);
}
