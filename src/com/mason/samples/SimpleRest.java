package com.mason.samples;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bmason42 on 8/26/15.
 */
@WebServlet(value ="/test", name = "SimpleRest")
public class SimpleRest extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out=new PrintWriter(response.getOutputStream());
        response.setHeader("Content-Type","application/json");
        out.println("{\"message\":\"Hello World\"}");

        out.flush();
        out.close();
    }
}
