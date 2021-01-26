package com.gao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//设置访问路径
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    /**
     * 使用HttpServlet 的get方法访问jsp文件
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "我的简易框架");
        /**
         * RequestDispatcher
         * 1、该对象作为位于给定路径的资源。
         * 2、对象可以用来转发资源的请求，或将该资源包含在响应中。
         */
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }
}
