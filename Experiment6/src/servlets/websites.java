package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class websites
 */
@WebServlet("/websites")
public class websites extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public websites() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String value=request.getParameter("Website");
		if(value.equals("google")) {
			response.sendRedirect("https://www.google.com");
		}
		else if(value.equals("codetantra")) {
			response.sendRedirect("https://www.codetantra.com");
		}
		else if(value.equals("hackerrank")) {
			response.sendRedirect("https://www.hackerrank.com");
		}
		else if(value.equals("codechef")) {
			response.sendRedirect("https://www.codechef.com");
		}
		else if(value.equals("internshala")) {
			response.sendRedirect("https://www.internshala.com");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
