package com.example.ca_2_baking_information_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.BakedGood;
import utils.HashSC;

import java.io.IOException;

public class BakeryApplication extends Application {
    public static Scene scene1,scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scene10,scene11,scene12;
    public static Stage primaryStage;
    static BakedGood b = new BakedGood("", "", "", "");
    public static HashSC<BakedGood> bakedList = new HashSC<>(b.getClass(),100);

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("mainViewBakery.fxml"));
        scene1 = new Scene(fxmlLoader.load(), 900, 600);
        scene1.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("addBakedGoodView.fxml"));
        scene2 = new Scene(fxmlLoader.load(), 900, 600);
        scene2.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("addIngredientView.fxml"));
        scene3 = new Scene(fxmlLoader.load(), 900, 600);
        scene3.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("addRecipe.fxml"));
        scene4 = new Scene(fxmlLoader.load(), 900, 600);
        scene4.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("bakedGood-view.fxml"));
        scene5 = new Scene(fxmlLoader.load(), 900, 600);
        scene5.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("ingredient-view.fxml"));
        scene6 = new Scene(fxmlLoader.load(), 900, 600);
        scene6.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("recipe-view.fxml"));
        scene7 = new Scene(fxmlLoader.load(), 900, 600);
        scene7.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("SearchView.fxml"));
        scene8 = new Scene(fxmlLoader.load(), 900, 600);
        scene8.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("updateBakedGoodView.fxml"));
        scene9 = new Scene(fxmlLoader.load(), 900, 600);
        scene9.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("updateIngredientView.fxml"));
        scene10 = new Scene(fxmlLoader.load(), 900, 600);
        scene10.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());
        fxmlLoader = new FXMLLoader(BakeryApplication.class.getResource("updateRecipe.fxml"));
        scene11 = new Scene(fxmlLoader.load(), 900, 600);
        scene11.getStylesheets().add(getClass().getResource("mainStyle.css").toExternalForm());

        stage.setTitle("Baked at SETU");
        stage.setScene(scene1);
        stage.show();
        primaryStage = stage;


    }

    public static void main(String[] args) {
        launch();
    }

}