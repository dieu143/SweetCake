package com.example.sweetcake.controller.client;



import com.example.sweetcake.dao.client.impl.BlogDao;
import com.example.sweetcake.model.client.Blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BlogController", value= "/blog")
public class BlogController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        BlogDao dao = new BlogDao();
        List<Blog> list = dao.getListBlog();

        request.setAttribute("listB",list);
        request.getRequestDispatcher("/view/client/blog.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
}
