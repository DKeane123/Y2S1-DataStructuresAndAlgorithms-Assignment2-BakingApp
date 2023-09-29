package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import models.BakedGood;
import utils.Node;
import utils.NodeList;

public class BakedGoodController {

    public ListView<BakedGood> bakedGoodMainList;
    public static BakedGoodController bakedGoodController;


    public void returnBaked(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }

    public void updateBakedListView() {
        /*bakedGoodMainList.getItems().clear();
        for(BakedGood bg : bakedGoods)
            bakedGoodMainList.getItems().add(bg);*/
    }

    public void editBakedGood(MouseEvent mouseEvent) {
    }

    public void removeBakedGood(MouseEvent mouseEvent) {

    }

    public void returnRecipe(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene7);
    }

    public void returnIngredient(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene6);
    }

    public void addBakedPage(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene2);
    }

    public void updateBakedPage(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene9);
    }

    public void home(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }

    public void initialize() {
        bakedGoodController=this;
    }
}
