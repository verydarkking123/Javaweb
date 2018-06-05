

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns="/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("test/html");
		ServletContext context=getServletContext();
		Integer count=null;
		synchronized(context)
		{
			count=(Integer)context.getAttribute("count");
			if(count==null)
				count=new Integer(1);
			else
				count=new Integer(count.intValue()+1);
			context.setAttribute("count", count);
		}
		String usr= request.getParameter("username");
		String pas=request.getParameter("password");
		System.out.println(usr);
		System.out.println(pas);
		System.out.println("count   "+count);
		if((usr!=null)&&(pas!=null)&&(usr.equals("wang"))&&(pas.equals("123")))
		{
			response.sendRedirect("01/success.html");
		}
		else
			response.sendRedirect("01/welcome.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
