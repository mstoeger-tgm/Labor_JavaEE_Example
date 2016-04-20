package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GespeicherteVariable
 */
@WebServlet("/GespeicherteVariable")
public class GespeicherteVariable extends HttpServlet {
	private int count=0;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GespeicherteVariable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.write("<html><body><form method='GET'><input type='text' width='100' name='number'/>"
				+ "<input type='submit' value='Hinzufuegen'/></form>");
		String tmp = request.getParameter("number");
		if(tmp!=null&&tmp!=""){
			int add = 0;
			try{
				add+=Integer.parseInt(tmp);
			}catch(Exception e){
				writer.write("Bitte nur Zahlen eingeben!<br>");
			}
			count+=add;
		}
		writer.write("Count: "+count+"<br>");
		writer.write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
