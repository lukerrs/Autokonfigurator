package Autokonfigurator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings({ "unused", "serial" })
@WebServlet("/UpdateCar")
public class UpdateCar extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{	
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		String carColor = req.getParameter("carColor");
		String wheelColor = req.getParameter("wheelColor");
		String model = req.getParameter("model");
		out.println
		(
			"<html>\n" +
			"<style>\n" +
			"h1{text-align: center;}\n" + 
			"body\n" +
			"{\n" +
			"background-color: rgb(50, 50, 50);\n" +
			"color: white;\n" +
			"}\n" +
			"form\n" +
			"{\n" +
			"	margin: 0;\n" +
			"	color: white;\n" +
			"	position: absolute;\n" +
			"	top: 100%;\n" +
			"	left: 50%;\n" +
			"	transform: translate( -50%, -100%);\n" +
			"	border: 3px solid rgb(75, 75, 75);\n" +
		  	"}\n" +
		  	"table {\n" +
			"	border-collapse: collapse;\n" +
			"	width: 100%;\n" +
			"	border: 2px solid white;\n" +
			"}\n" +
			"th, td {\n" +
			"	text-align: left;\n" +
			"	padding: 16px;\n" +
			"}\n" +
			".center\n" +
			"{\n" +
			"	display: block;\n" +
			"	margin: auto;\n" +
			"	width: 75%;\n" +
			"	height: 75%;\n" +
			"}" +
			"</style>\n" +
			"<head> <title> Audokonfigurator </title> </head>\n" +
			"<body>\n" +
			"<div>\n" +
			"<h1> Audokonfigurator </h1>\n"
			);
			switch(model) {
			case "koenigsegg":
				out.println("<img src=\"./img/carKoenig.png\" alt=\"carKoenigPic\" class=\"center\">\n");
				break;
			case "lambo":
				out.println("<img src=\"./img/carLambo.png\" alt=\"carLamboPic\" class=\"center\">\n");
				break;
			}
		out.println(
			"</div>\n" +
			"<div>\n" +
			"<form action=\"UpdateCar\" method=\"post\">\n" +
			"<table>\n" +
			"<tr>\n" +
			"	<td>Model</td>\n" +
			"	<td>\n" +
			"		<input type=\"radio\" name=\"model\" id=\"r1\" value=\"ferrari\"> <label for=\"r1\">Ferrari</label> <br>\n" +
			"		<input type=\"radio\" name=\"model\" id=\"r2\" value=\"porsche\"> <label for=\"r2\">Porsche</label> <br>\n" +
			"		<input type=\"radio\" name=\"model\" id=\"r3\" value=\"lambo\"> <label for=\"r3\">Lamborghini</label> <br>\n" +
 			"		<input type=\"radio\" name=\"model\" id=\"r4\" value=\"Koenigsegg\"> <label for=\"r4\">Koenigsegg</label>\n" +
			"	</td>\n" +
			"	<td>Wheels</td>\n" +
			"	<td>\n" +
			"		<input type=\"radio\" name=\"wheels\" id=\"r1\" value=\"f52\"> <label for=\"r1\">F52</label> <br>\n" +
			"		<input type=\"radio\" name=\"wheels\" id=\"r2\" value=\"bbs\"> <label for=\"r2\">BBS</label> <br>\n" +
			"		<input type=\"radio\" name=\"wheels\" id=\"r3\" value=\"borbet\"> <label for=\"r3\">Borbet</label> <br>\n" +
			"		<input type=\"radio\" name=\"wheels\" id=\"r4\" value=\"ozracing\"> <label for=\"r4\">OZ RACING</label>\n" +
			"	</td>\n" +
			"	<td> \n" +
			"		<input type=\"color\" name=\"carColor\"> Car Color <br>\n" +
			"		<input type=\"color\" name=\"wheelColor\"> Wheel Color \n" +
			"	</td>\n" +
			"	<td> " +
			"		<input type=\"submit\" value=\"Submit\"> \n" +
			"		<input type=\"button\" value=\"Save\"> \n" +
			"</td>\n" +
			"</tr>\n" +
			"</table>\n" +
			"</form>\n" +
			"</div>\n" +
			"</body>\n" +	
			"</html>"
		);
		out.close();
	}
}
