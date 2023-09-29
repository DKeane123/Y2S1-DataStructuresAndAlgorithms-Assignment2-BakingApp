package models;

public class IngredientQuantity {

    private Ingredient ingredient;
    private float quantity;
    private int calories;

    //constructor
    public IngredientQuantity(Ingredient ingredient, float quantity){
        setIngredient(ingredient);
        setQuantity(quantity);
        setCalories((int) ((quantity/100)*ingredient.getCalPer100Unit()));
    }

    //setters
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    //getters
    public Ingredient getIngredient() {
        return ingredient;
    }

    public float getQuantity() {
        return quantity;
    }

    public int getCalories(){
        return calories;
    }

    public String toString() {
        return " ";
    }
}
