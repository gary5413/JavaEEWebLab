package lab06.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestInfo")
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>觀察請求資訊</title>");
		
		out.println("</head>");
	
		out.println("<h3>與請求有關的資訊</h3>");
		out.println("RequestURL: " + request.getRequestURL() + "<br>");
		out.println("RequestURI: " + request.getRequestURI() + "<br>");
		out.println("QueryString: " + request.getQueryString() + "<br>");
		out.println("Http Method: " + request.getMethod() + "<br>");
		out.println("Protocol: " + request.getProtocol() + "<br>");
		out.println("您的IP為: " + request.getRemoteAddr() + "<br>");
		out.println("<hr>");
		Enumeration<String> en = request.getHeaderNames();
		while (en.hasMoreElements()) {
			String header =  en.nextElement();
			out.println(header+":"+request.getHeader(header)+"<br>");
			
		}
		out.println("<hr>");
		out.println("<a href='/JavaEEWebLab/index.jsp'>BACK</a>");
		out.println("</body></html>");
		out.close();
	}

}
