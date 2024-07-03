package com.example.test2programming;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class HelloController {
    public TextField Email;
    public TextField Password;
    public Label message;


    public void Login(ActionEvent actionEvent) {

        String mail = Email.getText();
        String  pass = Password.getText();

        if(mail.equals("") && pass.equals("")){
        message.setText("Please enter username and password");
        } else {




            String jdbcUrl = "jdbc:mysql://localhost:3306/programming";
            String dbUser = "root";
            String dbPassword = "";
            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
                // Execute a SQL query to retrieve data from the database

                String query = "Select * From user_authentication_table Where Email= '"+mail+ "' AND Password='"+pass+" '";
                Statement statement = connection.createStatement();
                statement.execute(query);
                // Populate the table with data from the database

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


    }
