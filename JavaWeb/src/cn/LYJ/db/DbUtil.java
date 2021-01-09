package cn.LYJ.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	/**
	 * �������Ӷ���
	 * @return
	 */
	private Statement getStatement() {
		//����jdbc���Ӷ���
		Statement sm = null;
		Connection conn = null;
		try {
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
			//��ȡ���Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wollo?serverTimezone=GMT%2B8", "root", "123456789");
			//����sql����
			//����sql�������
			sm = conn.createStatement();
			//��ռλ����ֵ
			//ִ��
			//������ѯ���	
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sm;
	}
/**���ؽ����
 * 
 * @param sql
 * @return
 */
	public ResultSet executeQuery(String sql) {
		ResultSet rs = null;
		try {
			//ִ�в�ѯ��䣬���ؽ����
			rs = this.getStatement().executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	/**
	 * ִ�в����ؽ���Ĳ�ѯ���
	 * @param sql
	 * @return
	 * 
	 * 
	 * 
	 * executeUpdate����ִ������insert,update,delete�Ȳ������κμ��ϵ�sql���
	 */
	public int executeNoQuery(String sql) {
		int result=0;
		try {
			//ִ�в�ѯ��䣬����int��������ʾӰ�������
			result = this.getStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
