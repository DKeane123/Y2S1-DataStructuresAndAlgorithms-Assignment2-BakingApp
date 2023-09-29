package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import models.BakedGood;
import models.Ingredient;
import models.IngredientQuantity;
import models.Recipe;
import utils.NodeList;

import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class RecipeController {

    public ListView<Recipe> recipeMainList;
    @FXML
    TextField step;
    @FXML
    TextField quantity;
    @FXML
    ListView<Ingredient> listView;

    NodeList<String> steps;

    NodeList<IngredientQuantity> ingredients;

    public void addRecipeInfo(ActionEvent event){
        //get baked good by hash map key
        BakedGood bg = new BakedGood("", "", "", "");

        bg.getRecipes().addNode(new Recipe(steps, ingredients));
        steps = null;
        ingredients = null;

    }

    public void addStep(ActionEvent event){
        steps.addNode(step.getText());
        step.clear();
    }

    public void addIngredient(ActionEvent event) {
        ingredients.addNode(new IngredientQuantity((Ingredient) listView.getSelectionModel().getSelectedItem(), Integer.parseInt(quantity.getText())));
        quantity.clear();
    }

    public void addRecipe(MouseEvent mouseEvent) {
    }

    public void editRecipe(MouseEvent mouseEvent) {
    }

    public void removeRecipe(MouseEvent mouseEvent) {
    }

    public void returnRecipe(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }

    public void returnBaked(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene5);

    }

    public void returnIngredient(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene6);
    }

    public void addRecipePage(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene4);
    }

    public void updateRecipePage(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene11);
    }

    public void home(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }
}


