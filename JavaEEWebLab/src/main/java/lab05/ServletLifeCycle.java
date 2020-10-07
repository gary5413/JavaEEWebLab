package lab05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Life Cycle init()");
		System.out.println("當某個Servlet實體化後，容器會立刻執行此方法");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Servelt Life Cycle destroy()");
		System.out.println("當系統關機時或Servlet所佔用記憶體回收時，容器會執行此方法");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		//告訴前端裝置 回應資料的格式為html UTF-8
		
		PrintWriter writer = response.getWriter();
		//取得能夠寫出回應資料的Writer物件
		//一個Servlet一次只能寫回一種(文字或非文字)資料給瀏覽器，不能同時寫回文字或非文字資料
		writer.println("<h1>本程式沒有前端回應，此頁面由程式動態生成並觀察IDE Console</h1>");
		writer.println("<p>使用response.getWriter</p>");
		writer.println("<hr>");
		writer.println("<a href='../index.jsp'>回首頁</a>");
		System.out.println("Servlet Life Cycle service()");
	}

}
