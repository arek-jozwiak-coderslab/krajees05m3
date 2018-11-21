package pl.coderslab;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/post2")
public class Post2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String confirm = request.getParameter("confirm");
        String message = request.getParameter("message");
        List<String> list = Arrays.asList("dupa", "dupa2");


        if (confirm == null) {
            String censored = "";
            String[] words = message.split(" ");
            for (String s : words) {
                if (list.contains(s)) {
                    censored += StringUtils.repeat("*", s.length());
                } else {
                    censored += s + " ";
                }
            }

            response.getWriter().append(censored);
        } else {
            response.getWriter().append(message);
        }

    }

}
