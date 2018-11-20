package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("111<h1>Hello world</h1>");
        response.getWriter().append("<p>Hello world</p>");

        int a = Integer.parseInt(request.getParameter("id"));

        int result = a * 23;

        response.getWriter().append("<p>p: " + result + "</p>");

        System.out.println("HHHHHHHHHHEEEELLLLLOOOOO");
        //http://localhost:8080/home?id=1
        //https://allegro.pl/listing?string=toyota
    }
}
