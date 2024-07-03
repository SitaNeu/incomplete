module com.example.test2programming {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.test2programming to javafx.fxml;
    exports com.example.test2programming;
}