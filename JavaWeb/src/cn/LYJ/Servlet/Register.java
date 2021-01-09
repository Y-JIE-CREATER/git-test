package cn.LYJ.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.LYJ.pojo.User;
import cn.LYJ.service.LoginService;
import cn.LYJ.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//������������ʽ
		req.setCharacterEncoding("utf-8");
		//������Ӧ�����ʽ
		resp.setContentType("text/html;charset=utf-8");
		//��ȡ������Ϣ
		String uname=req.getParameter("uname");
		String pwd = req.getParameter("pwd");
		
		User myuser = new User();
		myuser.setUname(uname);
		myuser.setPwd(pwd);
		
		LoginService loginService = new LoginServiceImpl();
		int result = loginService.insertUser(myuser);
		if(result>=0) {
			resp.sendRedirect("index.jsp");
		}
	}

}
