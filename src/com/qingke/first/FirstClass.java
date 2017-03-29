package com.qingke.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qingke.listener.SessionBindingListener;

/**
 * Servlet implementation class FirstClass
 */
@WebServlet("/FirstClass")
@MultipartConfig
public class FirstClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstClass() {
        super();
        System.out.println("===========================");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println(this.getServletConfig());
//		System.out.println(request.getPathInfo());
//		response.sendRedirect("http://qingke.me");
//		FORWARD==========================
//		forward(request, response);
//		throw new RuntimeException();
//		cookie==================================
//		testCookie(response);
//		testSessionBinding(request);
//		ResponseHtml(response);
//		responseImage(response);
		request.setCharacterEncoding("utf-8");
		String contentType = request.getContentType();
		System.out.println(request.getPart("file"));
		System.out.println(request.getPart("file").getSubmittedFileName());
		System.out.println(System.getProperty("java.io.tmpdir"));
		if(contentType!=null && contentType.contains("mulipart/form-data")){
			
		}
//		HttpSession session = request.getSession(false);
//		if(session==null){
//			session = request.getSession(true);
//			session.setAttribute("t", "tom");
//			System.out.println("set session");
//		}else{
//			Enumeration<String> attr = session.getAttributeNames();
//			System.out.println(session.getId());
//			while(attr.hasMoreElements()){
//				System.out.println(session.getAttribute(attr.nextElement()));
//			}
//			session.invalidate(); 
//		}
		
	}

	public void testSessionBinding(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		session.setAttribute("value", "tom");
		session.setAttribute("value1", "tom");
		session.setAttribute("listen", new SessionBindingListener());
	}

	public void responseImage(HttpServletResponse response) throws FileNotFoundException, IOException {
		response.setContentType("image/jpeg");
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\acer\\Desktop\\4fcec0606aaeb.jpg"));
		int length = fis.available();
		byte[] content = new byte[length];
		fis.read(content);
		fis.close();
		response.getOutputStream().write(content);
		response.setContentLength(length);
		response.flushBuffer();
	}

	public void forward(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("tom", "tom");
		request.getRequestDispatcher("/SecondSevlet").forward(request, response);
	}

	public void testCookie(HttpServletResponse response) {
		response.addCookie(new Cookie("tom", "tom"));
		Cookie cookie = new Cookie("tom1", "tom1");
		cookie.setComment("hehe");
		response.addCookie(cookie);
		cookie = new Cookie("tom2", "tom2");
		cookie.setMaxAge(10);
		response.addCookie(cookie);
	}

	public void ResponseHtml(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.getWriter().println("<span>ÖÐÎÄ</span>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
