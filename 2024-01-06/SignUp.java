package com.web.myproject;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 화면에서 넘어온 파라메터의 값을 추출한다.
		String id = request.getParameter("id");
		String psw = request.getParameter("psw");
		String pswcheck = request.getParameter("pswcheck");
		String name = request.getParameter("name");
		// 추출한 파라메터의 정보를 다시 html 형태로 만들어서 브라우져에 보낸다.
		String html = "<html><head>"
				+ "<meta charset=\"UTF-8\">"
				+ "id : "+id+ "<br>"
				+ "psw : "+psw+ "<br>"
				+ "name : "+name+ "<name>"
				+ "</head></html>"
				;
		response.getWriter().append(html);
		
	}

}
