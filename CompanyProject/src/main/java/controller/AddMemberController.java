package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.impl.MemberDaoImpl;
import entity.Member;


@WebServlet("/AddMemberController")
public class AddMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username=request.getParameter("username");
		boolean x=new MemberDaoImpl().checkUsername(Username);
		
		if(x)
		{
			response.sendRedirect("addMemberError.jsp");
		}
		else
		{
			String Name=request.getParameter("name");
			String Password=request.getParameter("password");
			String Address=request.getParameter("address");
			String Phone=request.getParameter("phone");
			Member member=new Member(Name,Username,Password,Address,Phone);
			
			new MemberDaoImpl().addMember(member);
			
			response.sendRedirect("addMemberSuccess.jsp");
		}
	}

}