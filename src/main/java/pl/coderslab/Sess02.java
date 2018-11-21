package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/sess02")
public class Sess02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("<form action='' method='post'>");
        response.getWriter().append("<input name='grade'/><br/>");
        response.getWriter().append("<input type='submit'/></form>");

        HttpSession session = request.getSession();
        if (session.getAttribute("grades") != null) {
            List<Integer> list = (List<Integer>) session.getAttribute("grades");
            response.getWriter().append(list.toString());
        }else{
            response.getWriter().append("No grades");
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int grade = Integer.parseInt(request.getParameter("grade"));
        HttpSession session = request.getSession();
        List<Integer> grades;
        if (session.getAttribute("grades") != null) {
            grades = (List<Integer>) session.getAttribute("grades");
        } else {
            grades = new ArrayList<>();
        }

        grades.add(grade);
        session.setAttribute("grades", grades);
        response.getWriter().append(grades.toString());

    }
}
