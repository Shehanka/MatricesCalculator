package com.chamodshehanka.matricesCalculator.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author chamodshehanka on 6/9/2018
 * @project MatricesCalculator
 **/
public class MatricesCalculator extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass()
                .getResource("/com/chamodshehanka/matricesCalculator/view/fxml/MatricesCalculatorUI.fxml"));
        primaryStage.setTitle("Matrices Calculator");
        primaryStage.getIcons().add(new Image(getClass()
                .getResourceAsStream("/com/chamodshehanka/matricesCalculator/icon/icon.png")));
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
