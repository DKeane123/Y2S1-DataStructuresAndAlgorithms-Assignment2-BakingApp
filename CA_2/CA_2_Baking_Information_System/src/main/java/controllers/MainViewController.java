package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TreeView;
import javafx.scene.text.Font;

public class MainViewController {

    @FXML
    private TreeView<?> mainTreeView;

    @FXML
    private Font x1;

    public  void bakedGoodMain(ActionEvent event){
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene5);
    }

    public  void recipeMain(ActionEvent event){
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene7);
    }

    public void ingredientMain (ActionEvent event){
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene6);
    }
}
