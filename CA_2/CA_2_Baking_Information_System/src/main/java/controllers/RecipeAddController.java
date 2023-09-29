package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.Ingredient;
import utils.NodeList;
import utils.Utils;

public class RecipeAddController {
    public TextArea stepField;
    public ListView<Ingredient> ingredientsList, chosenIngredientList;

    public  ListView<String> stepList;
    public TextField quantityField;

    public int count = 1;

    private NodeList<String> steps = new NodeList<>();
    private  NodeList<Ingredient> ingredients = new NodeList<>();

    public void populateStepListView(){
        stepList.getItems().clear();
        for(String s : steps){
            stepList.getItems().add(s);
        }
    }

    public void returnToBakedGood(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene5);

    }

    public void returnToRecipe(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene7);

    }

    public void returnToIngredient(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene6);

    }

    public void addStep(ActionEvent event) {
        if(Utils.containsChar(stepField.getText())){
            steps.addNode(count +". " + stepField.getText());
        }
        count++;
        stepField.clear();
        populateStepListView();
    }

    public void addIngredient(ActionEvent event) {

    }

    public void addRecipe(ActionEvent event) {
        count = 1;
        steps = new NodeList<String>();
        ingredients = new NodeList<Ingredient>();
        populateStepListView();

    }

    public void home(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }
}
