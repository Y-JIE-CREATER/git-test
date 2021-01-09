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
 * Servlet implementation class LoginDo
 */
@WebServlet("/LoginDo")
public class LoginDo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		if(loginService.ifExit(myuser)) {
			req.setAttribute("user","admin");
			//req.getSession().setAttribute("user","administrator");
			//实现请求转发的代码
	       req.getRequestDispatcher("welcome.jsp").forward(req,resp);
			//resp.sendRedirect("welcome.jsp");
		}else {
			resp.sendRedirect("index.jsp");
		}
		//����������Ϣ
		//��Ӧ������
	}


}
