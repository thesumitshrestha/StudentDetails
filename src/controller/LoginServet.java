package controller;

import model.Student;
import service.AllStudentsService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by sarasumit on 6/24/2016.
 */
@javax.servlet.annotation.WebServlet(name = "LoginServet")
public class LoginServet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserService userService = new UserService();

        if(userService.isAuthentic(username, password)){

            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            session.setMaxInactiveInterval(30 * 60);

            if(username.equals("admin")){
                Student student=new Student();
                AllStudentsService allStudents=new AllStudentsService();
                System.out.println("asddas");
                System.out.println("student"+ student);
                List<Student> studentDetail =allStudents.displayStudents(student);
                request.setAttribute("studentDetail",studentDetail);
                System.out.println("here");
                System.out.println(studentDetail);
                /*RequestDispatcher rd = getServletContext().getRequestDispatcher("/view/allStudents.jsp");
                rd.forward(request, response);*/
                request.getRequestDispatcher("/view/dashboard/adminDashboard.jsp").forward(request,response);
            }

            else{
                request.getRequestDispatcher("/view/dashboard/studentDashboard.jsp").forward(request,response);
            }
        }else{

            request.getRequestDispatcher("/view/login/login.jsp").forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
