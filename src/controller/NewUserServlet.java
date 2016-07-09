package controller;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by sarasumit on 6/24/2016.
 */
@WebServlet(name = "NewUserServlet")
public class NewUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        User user = new User(username, password, firstName, lastName, email);

        int id = new UserService().save(user);
        if(id != 0){

            user.setId(id);
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            session.setMaxInactiveInterval(30 * 60);

            response.sendRedirect("/opinionFeed");
        }else{

            System.out.println("Could not save user");
            response.sendRedirect("/view/login/login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
