package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@WebServlet("/post4")
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] numbers = request.getParameterValues("numbers");
        List<Integer> sorted = new ArrayList<>();
        for (String s : numbers) {
            if (StringUtils.isNumeric(s)) {
                sorted.add(Integer.parseInt(s));
            }
        }
        Collections.sort(sorted);
        response.getWriter().append(sorted.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("<form action='' method='post'>");

        Random random = new Random();
        int randomNumer = random.nextInt(10 - 5 + 1) + 5;

        for (int i = 0; i < randomNumer; i++) {
            response.getWriter().append("<input name='numbers'/><br/>");
        }

        response.getWriter().append("<input type='submit'/></form>");
    }
}
