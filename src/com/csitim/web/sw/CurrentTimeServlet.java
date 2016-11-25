package com.csitim.web.sw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Timea_Csiszar on 11/25/2016.
 */
@WebServlet("/time") //localhost:8080/time
public class CurrentTimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
    }
}
