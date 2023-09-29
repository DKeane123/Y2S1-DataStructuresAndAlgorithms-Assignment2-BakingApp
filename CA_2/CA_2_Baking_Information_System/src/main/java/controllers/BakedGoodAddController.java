package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import models.BakedGood;
import utils.NodeList;
import utils.Utils;

public class BakedGoodAddController {

    public TextField name,country,picture;
    public TextArea description;

    public ListView<BakedGood> bakedGoodMainList;
    public ListView<BakedGood> BakedGoodListView;

    /*public void addBakedGood(ActionEvent event) {
        BakedGood bg = new BakedGood(name.getText(), country.getText(), description., picture.toString());
        System.out.println(bg);
    }*/

    public void returnIngredient(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene6);

    }

    public void addBakedGood(ActionEvent event) {
        if(Utils.containsChar(name.getText()) && Utils.containsChar(country.getText()) && Utils.containsChar(description.getText()) && Utils.containsChar(picture.getText())){
            /*BakedGood bakedGood = new BakedGood(name.getText(), country.getText(), description.getText(), picture.getText());
            System.out.println(name.getText() + " originating from " + country.getText() + " is " + description.getText() + " Picture: " + picture.getText());
            BakedGoodController.bakedGoodController.updateBakedListView();
            BakeryApplication.bakedList.add(bakedGood);
            BakeryApplication.bakedList.displayHashTable();*/

        }
        //BakedGoodListView.getItems().add(bakedGood);


        name.clear();
        country.clear();
        description.clear();
        picture.clear();
    }

    public void deleteBakedGood(ActionEvent event){

        if((BakedGood) BakedGoodListView.getSelectionModel().getSelectedItem() != null){
            //get position of baked good from hash map
            //set to null
        }

    }

    public void addBakedGood(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene2);
    }

    public void editBakedGood(MouseEvent mouseEvent) {
    }

    public void removeBakedGood(MouseEvent mouseEvent) {
    }

    public void home(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }

    public void returnBaked(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene5);
    }

    public void returnRecipe(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene7);
    }

}
