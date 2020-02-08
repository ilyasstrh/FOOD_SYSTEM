package com.mycompany.fds.View;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import static javafx.scene.text.TextAlignment.CENTER;

public class RestaurantCard {

    public static AnchorPane creat(String titre, String img, String des) throws MalformedURLException, URISyntaxException, FileNotFoundException {
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefHeight(110);
        anchorPane.setPrefWidth(140);
        Image img2 = new Image(img);
        ImageView image = new ImageView(img2);

        // image.setImage(img2);
        image.setFitHeight(110);
        image.setFitWidth(144);
        image.setPickOnBounds(true);
        image.setLayoutX(2);


        Label lab = new Label();
        lab.setLayoutX(5);
        lab.setLayoutY(100);
        lab.setPrefHeight(44);
        lab.setPrefWidth(140);
        lab.setText(" "+titre);
        lab.setStyle("-fx-font-weight: bold;" );
        lab.setTextAlignment( CENTER );
        lab.setAlignment(Pos.CENTER);

        Label lab2 = new Label();
        lab2.setLayoutX(5);
        lab2.setLayoutY(120);
        lab2.setPrefHeight(44);
        lab2.setPrefWidth(140);
        lab2.setText(des);
        anchorPane.getStylesheets().add("/styles/Styles.css");

        anchorPane.getChildren().add(image);
        anchorPane.getChildren().add(lab);
        anchorPane.getChildren().add(lab2);
        anchorPane.getStyleClass().add("h");

        anchorPane.setOnMouseClicked((e) -> {
            System.out.println(titre);
        });

        return anchorPane;
    }


}