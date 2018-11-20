package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        try {
            int start = Integer.parseInt(request.getParameter("start"));
            int end = Integer.parseInt(request.getParameter("end"));
            for (int i = start; i < end; i++) {
                response.getWriter().append("<p> " + i + "</p>");
            }

        }catch (NumberFormatException ex){
            response.getWriter().append("Nieprawidłowe paramerty");
        }
    }
}
