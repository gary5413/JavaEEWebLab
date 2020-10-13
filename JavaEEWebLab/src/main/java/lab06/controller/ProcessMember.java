package lab06.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab06.model.memberBean;


@WebServlet("/javaEEWeb/lab06/ProcessMember")
public class ProcessMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {	
		request.setCharacterEncoding("UTF-8");
		//說明瀏覽送來的文字編碼設定
		String name = request.getParameter("name");
		//getParameter() 讀取參數 結果為String
		//讀取使用者 <input name="name" 	標籤內所輸入的資料 放入變數name內
		if(name==null || name.length()==0) {
			name="請輸入名字";
		}
		//如果瀏覽器沒有送來資料 或去掉該資料頭尾空白後 長度為0 就放入請輸入字串
		
		String email = request.getParameter("email");
		if(email==null || name.length()==0) {
			email="請輸入E-Mail";
		}
		
		String[] fruits = request.getParameterValues("fruit");
		//getParameterValues() 讀取所有參數值 結果為String[]
		//getParmeterNames() 讀取所有參數名稱 結果為Enumeration
		
		memberBean memberBean = new memberBean(name,email,fruits);
		request.setAttribute("memberBean", memberBean);
		RequestDispatcher rd = request.getRequestDispatcher("/javaEEWeb/lab06/lab06_display.jsp");
		
		rd.forward(request, response);
		
		
	}
}
