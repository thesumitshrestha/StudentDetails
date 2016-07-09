package service;

import model.Student;
import util.DBConnection;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sarasumit on 6/26/2016.
 */
public class SearchService {
    private Connection connection = null;
    private Statement statement;
    private ResultSet resultSet;

    public SearchService(){

        connection = new DBConnection().getConnection();
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Student> search(String name){
        List<Student> studentDetail = new LinkedList<Student>();
        String query = "select name,address,roll,email,batch from student where name like '%"+name+"%' ";
        System.out.println("Search name is" +name);
        try {
            Statement stmt = connection.createStatement();

            /*PreparedStatement ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();*/
            resultSet = stmt.executeQuery(query);

            System.out.println("Here at table");

                while(resultSet.next()) {
                    Student student = new Student();
                    student.setName(resultSet.getString("name"));
                    student.setBatch(resultSet.getInt("batch"));
                    student.setRoll(resultSet.getInt("roll"));
                    student.setEmail(resultSet.getString("email"));
                    student.setAddress(resultSet.getString("address"));
                    studentDetail.add(student);
                    System.out.println("asdasdasd");
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentDetail;
    }

}
