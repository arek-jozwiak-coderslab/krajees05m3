package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get11")
public class Get11 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String startString = request.getParameter("start");
        String endString = request.getParameter("end");

        if (StringUtils.isNumeric(startString) && StringUtils.isNumeric(endString)) {
            int start = Integer.parseInt(startString);
            int end = Integer.parseInt(endString);
            for (int i = start; i < end; i++) {
                response.getWriter().append("<p> " + i + "</p>");
            }
        } else {
            response.getWriter().append("Nieprawidłowe paramerty");
        }
    }
}
