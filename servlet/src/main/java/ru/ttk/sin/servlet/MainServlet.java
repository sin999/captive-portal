package ru.ttk.sin.servlet;


import ru.ttk.sin.ejbs.SimpleService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;


@WebServlet(urlPatterns = "sss")
public class MainServlet extends HttpServlet {
    @EJB
    private SimpleService simpleService;

    @Override
    public void init(){
        System.out.println("########### its my init method!!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        Writer writer = resp.getWriter();
        writer.write("Hello world! >> now is"+(new Date()));
        writer.write(simpleService.getGritting());
    }
}
