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

public class CrudController {
    public TableView Table;
    public TableColumn AttendanceID;
    public TableColumn EmployeeName;
    public TableColumn Date;
    public TableColumn Status;
    public TextField id;
    public TextField name;
    public TextField date;
    public TextField stat;

    ObservableList<crud> list = FXCollections.observableArrayList();


    protected void Fetch() {
        fetchdata();
    }

    private void fetchdata() {
        list.clear();

        String jdbcUrl = "jdbc:mysql://localhost:3306/programming";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "SELECT * FROM employee_attendance";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Populate the table with data from the database
            while (resultSet.next()) {
                int EmployeeID = resultSet.getInt("id");
                String EmployeeName = resultSet.getString("name");
                String Date = resultSet.getString("date");
                String Status = resultSet.getString("stat");
                employee_attendance.getItems().add(new crud(EmployeeID, EmployeeName, Date, Status));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new PropertyValueFactory<crud,Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<crud,String>("name"));
        date.setCellValueFactory(new PropertyValueFactory<crud,String>("email"));
        stat.setCellValueFactory(new PropertyValueFactory<crud,String>("password"));
        employee_attendance.setItems(list);


    }



    public void Load(ActionEvent actionEvent) {



    }

    public void Insert(ActionEvent actionEvent) {





        String sname = name.getText();
        String sdate= date.getText();
        String sstat = stat.getText();




        String jdbcUrl = "jdbc:mysql://localhost:3306/programming";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "INSERT INTO `employee_attendance`( `EmployeeName`, `Date`, `Status`) VALUES ('"+name+"','"+date+"','"+stat+"')";
            Statement statement = connection.createStatement();
            statement.execute(query);
            // Populate the table with data from the database

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void Update(ActionEvent actionEvent) {

        String uid = id.getText();
        String uname = name.getText();
        String dat = date.getText();
        String st = stat.getText();




        String jdbcUrl = "jdbc:mysql://localhost:3306/programming";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "UPDATE `employee_attendance` SET `EmployeeName`='"+name+"',`Date`='"+date+"',`Status`='"+stat+"' WHERE AttendanceID='"+id+"' ";
            Statement statement = connection.createStatement();
            statement.execute(query);
            // Populate the table with data from the database

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }

    public void Delete(ActionEvent actionEvent) {

        String uid = id.getText();




        String jdbcUrl = "jdbc:mysql://localhost:3306/programming";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "DELETE FROM `employee_attendance` WHERE AttendanceID='"+id+"'";
            Statement statement = connection.createStatement();
            statement.execute(query);
            // Populate the table with data from the database

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


