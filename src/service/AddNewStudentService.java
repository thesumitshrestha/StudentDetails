package service;

import model.Student;
import util.DBConnection;

import java.sql.*;

/**
 * Created by sarasumit on 6/25/2016.
 */
public class AddNewStudentService {
    private Connection dbConnection;

    public AddNewStudentService(){

        dbConnection = new DBConnection().getConnection();
    }

    public void addNewStudent(Student student){
        try {
            PreparedStatement ps = dbConnection.prepareStatement(
                    "INSERT INTO student(name, batch, roll, email, address) VALUES(?, ?, ?, ?, ?)"
            );
            ps.setString(1, student.getName());
            ps.setInt(2, student.getBatch());
            ps.setInt(3, student.getRoll());
            ps.setString(4, student.getEmail());
            ps.setString(5, student.getAddress());

            ps.execute();
            System.out.println("New Student Added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteStudent( int id ) {
        try {
            String query = "delete from student where id=?";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateStudent( Student student ) {
        try {
            System.out.println(student.getId());
            System.out.println(student.getName());
            System.out.println(student.getBatch());
            System.out.println(student.getEmail());
            System.out.println(student.getAddress());
            System.out.println(student.getRoll());
            String query = "update student set name='"+student.getName()+"', batch='"+student.getBatch()+"', " +
                    "roll='"+student.getRoll()+"', email='"+student.getEmail()+"', address='"+student.getAddress()+"'" +
                    " where id='"+student.getId()+"'";
            Statement stmt = dbConnection.createStatement();
//            preparedStatement.setInt(1, student.getId());
//            preparedStatement.setString(2, student.getName());
//            preparedStatement.setInt(3, student.getBatch());
//            preparedStatement.setInt(4, student.getRoll());
//            preparedStatement.setString(5, student.getEmail());
//            preparedStatement.setString(6, student.getAddress());
            System.out.println(query);
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Student getUserById(String userId) {
        Student student = new Student();
        try {
            PreparedStatement preparedStatement = dbConnection.
                    prepareStatement("select * from student where id=?");
            preparedStatement.setString(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));

                student.setBatch(rs.getInt("batch"));
                student.setRoll(rs.getInt("roll"));
                student.setAddress(rs.getString("address"));
                student.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return student;
    }
}
