package controllers;

import com.example.ca_2_baking_information_system.BakeryApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import models.BakedGood;
import models.Ingredient;
import utils.NodeList;

public class IngredientController {

    public ListView<Ingredient> ingredientMainList;

    public IngredientController() {
        this.ingredients = new NodeList<>();
    }

    public static NodeList<Ingredient> ingredients;

    public NodeList<Ingredient> getIngredients (){
        return ingredients;
    }

    private TextField AddIngredientName;

    private TextField AddIngredientDesc;

    private TextField AddCalPer100Unit;

    private TextField AddUnitOfMeasurement;

    public void addIngredient (Ingredient ingredient) {
        ingredients.addNode(ingredient);
    }

    public void deleteAllIngredients() {ingredients.reset();}

    public void addIngredientInfo(ActionEvent event) {
        Ingredient ingredient = new Ingredient(AddIngredientName.getText(), AddIngredientDesc.getText(), Integer.parseInt(AddCalPer100Unit.getText()), AddUnitOfMeasurement.getText());;

        ingredientMainList.getItems().add(ingredient);

        addIngredient(ingredient);

    }

    public void returnBaked(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene5);

    }

    public void returnRecipe(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene7);

    }

    public void returnIngredient(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }

    public void removeIngredient(MouseEvent mouseEvent) {
    }

    public void editIngredient(MouseEvent mouseEvent) {
    }

    public void addIngredientPage(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene3);
    }

    public void updateIngredientPage(MouseEvent mouseEvent) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene10);

    }

    public void home(ActionEvent event) {
        BakeryApplication.primaryStage.setScene(BakeryApplication.scene1);
    }
}
