package service;

import com.sun.org.apache.xpath.internal.SourceTree;
import model.Student;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sarasumit on 6/25/2016.
 */
public class AllStudentsService{
    private Connection connection = null;
    private Statement statement;
    private ResultSet resultSet;
    public AllStudentsService(){

        connection = new DBConnection().getConnection();
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public List<Student> displayStudents(Student student){
        System.out.println("here in service");
        List  <Student> studentDetail = new LinkedList<Student>();

        String query = "select * from student";
        try {

            resultSet=statement.executeQuery(query);

            while(resultSet.next()){
                student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setRoll(resultSet.getInt("roll"));
                student.setBatch(resultSet.getInt("batch"));
                student.setEmail(resultSet.getString("email"));
                student.setAddress(resultSet.getString("address"));
                studentDetail.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentDetail;

    }
}
