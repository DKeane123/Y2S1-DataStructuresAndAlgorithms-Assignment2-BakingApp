package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class IngredientAddController {
    public TextField nameField;
    public TextField calorieField;

    public void returnBaked(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene5);

    }

    public void returnHome(ActionEvent event) {
    }

    public void returnRecipe(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene7);

    }

    public void returnIngredient(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene6);

    }

    public void unitField(ActionEvent event) {
    }

    public void descriptionField(MouseEvent mouseEvent) {
    }

    public void addIngredient(MouseEvent mouseEvent) {
    }

    public void home(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }
}
