package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import dao.impl.MemberDaoImpl;
import entity.Member;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.request接收-->username,password
		 * 2.判斷login(帳號,密碼)
		 * 3->!=null-->loginSuccess
		 * null--->loginError
		 */
		
		HttpSession session=request.getSession();
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		List<Member> l=new MemberDaoImpl().login(Username, Password);
		
		if(l!=null)
		{
			Member member=l.get(0);
			session.setAttribute("M", member);
			response.sendRedirect("loginSuccess.jsp");
		}
		else
		{
			response.sendRedirect("loginError.jsp");
		}
	}

}