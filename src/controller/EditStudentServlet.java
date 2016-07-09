package controller;

import model.Student;
import service.AddNewStudentService;
import service.AllStudentsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sarasumit on 6/27/2016.
 */
@WebServlet(name = "EditStudentServlet")
public class EditStudentServlet extends HttpServlet {
    private static String INSERT_OR_EDIT = "/view/editStudent.jsp";

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
        String studentId = request.getParameter("id");
        Student student = new Student(name,roll,batchs,email,address);
        student.setId(Integer.parseInt(studentId));
        Student std = new Student();
        studentService.updateStudent(student);

        request.setAttribute("studentDetail", allStudentsService.displayStudents(std));
        request.setAttribute("studentDetails", student);
        request.getRequestDispatcher("/view/dashboard/adminDashboard.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
       /* String name = request.getParameter("name");
        String batch = request.getParameter("batch");
        String rollNo = request.getParameter("roll");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int roll = Integer.parseInt(rollNo);
        int batchs = Integer.parseInt(batch);*/
        System.out.println(request.getParameter("id"));
        String studentId = request.getParameter("id");
        Student student = studentService.getUserById(studentId);
        request.setAttribute("studentDetails", student);
        System.out.println("Update");
//        request.setAttribute("studentDetail", allStudentsService.displayStudents(student));
//        studentService.updateStudent(student);
//        request.setAttribute("studentDetails", student);
//        System.out.println("Update");
        request.getRequestDispatcher("/view/editStudent.jsp").forward(request, response);
    }
}
