package controller;

import model.Student;
import service.AddNewStudentService;
import service.AllStudentsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sarasumit on 6/27/2016.
 */
@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    private AddNewStudentService studentService = new AddNewStudentService();
    private AllStudentsService allStudentsService = new AllStudentsService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("id"));
        System.out.println("User Id in delete is " + studentId);
        Student std = new Student();
        studentService.deleteStudent(studentId);
        request.setAttribute("studentDetail", allStudentsService.displayStudents(std));
        request.getRequestDispatcher("/view/dashboard/adminDashboard.jsp").forward(request, response);    }
}
