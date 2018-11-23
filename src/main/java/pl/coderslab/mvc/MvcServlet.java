package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvcServlet")
public class MvcServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int km = Integer.parseInt(request.getParameter("km"));
        double miles = km *1.6093456;
        request.setAttribute("miles", miles);

        request.setAttribute("kmkm", km);


        getServletContext().getRequestDispatcher("/first.jsp")
                .forward(request, response);
    }
}
