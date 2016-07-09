package service;

import model.User;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sarasumit on 6/24/2016.
 */
public class UserService {
    private Connection dbConnection;

    public UserService(){

        dbConnection = new DBConnection().getConnection();
    }

    public boolean isAuthentic(String username, String password){

        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement("SELECT * FROM user WHERE username = ? and password = ?;");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.last();

            return resultSet.getRow() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public int save(User user){

        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(
                    "INSERT INTO user(password, username, email, firstName, lastName) VALUES(?, ?, ?, ?, ?)"
            );

            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getFirstName());
            preparedStatement.setString(5, user.getLastName());

           preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int getUserIdFromUsername(String username){

        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(
                    "SELECT id FROM user WHERE username = ?"
            );

            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            return resultSet.getInt("id");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public User getUserFromId(int id){

        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(
                    "SELECT * FROM user WHERE id = ?"
            );

            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            return new User(id, resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public User getUserByName(String name){

        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(
                    "SELECT * FROM user WHERE first_name = ? and last_name = ?"
            );

            String names[] = name.split(" ");
            preparedStatement.setString(1, names[0]);
            preparedStatement.setString(2, names[1]);

            ResultSet resultSet = preparedStatement.executeQuery();

            resultSet.next();

            return new User(resultSet.getInt("id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                   resultSet.getString("email"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
