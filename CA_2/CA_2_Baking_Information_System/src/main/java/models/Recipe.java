package models;

import controllers.RecipeController;
import utils.NodeList;

public class Recipe {
    NodeList<IngredientQuantity> ingredients = new NodeList<>();
    NodeList<String> steps = new NodeList<>();

    public Recipe(NodeList<String> steps, NodeList<IngredientQuantity> ingredients){
        setSteps(steps);
        setIngredients(ingredients);
    }

    public NodeList<IngredientQuantity> getIngredients() {
        return ingredients;
    }

    public NodeList<String> getSteps() {
        return steps;
    }

    public void setIngredients(NodeList<IngredientQuantity> ingredients) {
        this.ingredients = ingredients;
    }

    public void setSteps(NodeList<String> steps) {
        this.steps = steps;
    }

    public void addStep(String step){
        steps.addNode(step);
    }

    public void  addIngredients(Ingredient ingredient, float quantity){
        ingredients.addNode(new IngredientQuantity(ingredient, quantity));
    }
}
