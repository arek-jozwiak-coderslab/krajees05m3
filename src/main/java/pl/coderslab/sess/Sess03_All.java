package pl.coderslab.sess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/sess03All")
public class Sess03_All extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<String> keys = (List<String>) session.getAttribute("keys");

        for (String key : keys) {
            response.getWriter().append("key:" + key);
            response.getWriter().append("value: " + session.getAttribute(key));
        }

    }
}
