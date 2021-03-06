package com.chap01.recipe01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MathServlet", urlPatterns = {"/MathServlet"})
public class
MathServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        res.setContentType("text/html");
// Store the input parameter values into Strings
        String numA = req.getParameter("numa");
        String numB = req.getParameter("numb");
        PrintWriter out = res.getWriter();
        out.println("<html><head>");
        out.println("<title>Test Math Servlet</title>");
        out.println("\t<style>body { font-family: 'Lucida Grande', "
                + "'Lucida Sans Unicode';font-size: 13px; }</style>");
        out.println("</head>");
        out.println("<body>");
        try {
            int solution = Integer.valueOf(numA) + Integer.valueOf(numB);
            /*
             * Display some response to the user
             */
            out.println("<p>Solution: "
                    + numA + " + " + numB + " = " + solution + "</p>");
        } catch (java.lang.NumberFormatException ex) {
// Display error if an exception is raised
            out.println("<p>Please use numbers only...try again.</p>");
        }
        out.println("<br/><br/>");
        out.println("<a href='page.html'>Add Two More Numbers</a>");
        out.println("</body></html>");
        out.close();
    }
}