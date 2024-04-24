package Autokonfigurator;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/AudoLogin")
public class AudoLogin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{	
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		String user = req.getParameter("userName");
		String pass = req.getParameter("userPassword");
		out.println
		(
			"<html>" +
			"<style>\n" +
			"body\n" +
			"{\n" +
			"background-color: rgb(128, 128, 128);\n" +
			"color: white;\n" +
			"}\n" +
			"</style>\n" +
			"<body>\n"
		);
		if(user.equals("lukers") && pass.equals("audo"))
			out.println("Login Success...!\n");
		else
		out.println("Login Failed...!");
		out.println(
			"</body>" +	
			"</html>"
		);
		out.close();
	}
}