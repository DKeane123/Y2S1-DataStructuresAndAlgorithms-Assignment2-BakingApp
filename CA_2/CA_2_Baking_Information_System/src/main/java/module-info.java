module com.example.ca_2_baking_information_system {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.ca_2_baking_information_system to javafx.fxml;
    opens controllers to javafx.fxml;

    exports com.example.ca_2_baking_information_system;
    exports controllers;
    exports utils;
    exports models;
}