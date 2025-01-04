package org.dnyanyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {
    @FXML
    private TextField loginName;

    @FXML
    private TextField password;

    @FXML
    private Label errorMessage;

    @FXML
    public void loginButtonClick() throws SQLException, ClassNotFoundException {
        String username = loginName.getText();
        String pwd = password.getText();

        if (username.isEmpty() || pwd.isEmpty()) {
            errorMessage.setText("Both fields are required.");
        } else {
            System.out.println("Username: " + username);
            System.out.println("Password: " + pwd);
            errorMessage.setText(""); 

            
            Class.forName("com.mysql.cj.jdbc.Driver"); 

         
            String url = "jdbc:mysql://localhost:3306/login?useSSL=false&serverTimezone=UTC";
            String dbUsername = "root";
            String dbPassword = "shruti9160";

            
            Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);
            Statement statement = connection.createStatement();

            
            String insertQuery = "INSERT INTO users (loginName, password) VALUES ('" + username + "', '" + pwd + "')";
            int rowsAffected = statement.executeUpdate(insertQuery);

            if (rowsAffected > 0) {
                System.out.println("New User Added Successfully");
            } else {
                System.out.println("Failed to Add User");
            }

            
            statement.close();
            connection.close();
        }
    }
}
