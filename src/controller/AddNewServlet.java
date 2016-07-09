package controller;

import model.Student;
import service.AddNewStudentService;
import service.AllStudentsService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sarasumit on 6/25/2016.
 */
@WebServlet(name = "AddNewServlet")

public class AddNewServlet extends HttpServlet {

    private AddNewStudentService studentService = new AddNewStudentService();
    private AllStudentsService allStudentsService = new AllStudentsService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String batch = request.getParameter("batch");
        String rollNo = request.getParameter("roll");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int roll = Integer.parseInt(rollNo);
        int batchs = Integer.parseInt(batch);
        Student student = new Student(name, roll, batchs, email, address);
        new AddNewStudentService().addNewStudent(student);
        request.setAttribute("studentDetail", allStudentsService.displayStudents(student));
        request.setAttribute("studentDetails", student);
        request.getRequestDispatcher("/view/dashboard/adminDashboard.jsp").forward(request, response);
        /*String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("delete")) {
            int studentId = Integer.parseInt(request.getParameter("id"));
            System.out.println("User Id in delete is " + studentId);
            studentService.deleteStudent(studentId);
            forward = LIST_USER;
            request.setAttribute("studentDetail", allStudentsService.displayStudents(student));
        }*/
/*

        else if (action.equalsIgnoreCase("update")){
            forward = INSERT_OR_EDIT;
            studentService.updateStudent(student);
            request.setAttribute("studentDetails", student);
            System.out.println("Update");
            request.getRequestDispatcher("/view/editStudent.jsp").forward(request, response);
        }

        else {
            forward = INSERT_OR_EDIT;
        }
*/
/*
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*String name = request.getParameter("name");
        String batch = request.getParameter("batch");
        String rollNo = request.getParameter("roll");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        System.out.println(batch);
        int roll = Integer.parseInt(rollNo);
        int batchs = Integer.parseInt(batch);*/
       /* System.out.println(request.getParameter("id"));*/
        /*Student student = new Student(name,roll,batchs,email,address);*/
//        Student student = new AddNewStudentService().getUserById(request.getParameter("id"));
       /* Student student = null;
        String forward="";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("delete")){
            int studentId = Integer.parseInt(request.getParameter("id"));
            System.out.println("User Id in delete is "+studentId);
            studentService.deleteStudent(studentId);
            forward = LIST_USER;
            request.setAttribute("studentDetail", allStudentsService.displayStudents(student));
        } else if (action.equalsIgnoreCase("update")){
            forward = INSERT_OR_EDIT;
            String studentId = request.getParameter("id");
            student = studentService.getUserById(studentId);
            request.setAttribute("studentDetails", student);
            System.out.println("Update");
            request.getRequestDispatcher("/view/editStudent.jsp").forward(request, response);
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }*/
    }
}
