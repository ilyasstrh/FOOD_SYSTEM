package com.mycompany.fds.Controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class FoodPageController implements Initializable {
    @FXML
    public AnchorPane homePane;
    @FXML
    public AnchorPane profilePane;
    @FXML
    public AnchorPane panierPane;
    @FXML
    public JFXButton buttonHome;
    @FXML
    public JFXButton buttonPanier;
    @FXML
    public JFXButton ButtonProfile;
    @FXML
    private JFXButton bar2;
    @FXML
    private JFXButton bar1;
    @FXML
    private AnchorPane paneslide;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        paneslide.setTranslateX(-153);
        bar1.setVisible(true);
        bar2.setVisible(false);
        profilePane.setVisible(false);
        panierPane.setVisible(false);

    }

    public void run1(javafx.scene.input.MouseEvent mouseEvent) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(paneslide);
        slide.setToX(0);
        slide.play();
        homePane.toBack();
        profilePane.toBack();
        panierPane.toBack();
        paneslide.toFront();
        paneslide.setTranslateX(-153);
        slide.setOnFinished((ActionEvent e) -> {
            bar1.setVisible(false);
            bar2.setVisible(true);
        });
    }

    public void run2(javafx.scene.input.MouseEvent mouseEvent) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(paneslide);
        slide.setToX(-153);
        slide.play();
        homePane.toBack();
        paneslide.toFront();
        paneslide.setTranslateX(0);
        slide.setOnFinished((ActionEvent e) -> {
            bar1.setVisible(true);
            bar2.setVisible(false);
        });
    }

    public void OnPaniersAction(ActionEvent actionEvent) {
        profilePane.setVisible(false);
        homePane.setVisible(false);
        panierPane.setVisible(true);
    }

    public void onHomeAction(ActionEvent actionEvent) {
        profilePane.setVisible(false);
        homePane.setVisible(true);
        panierPane.setVisible(false);
    }

    public void OnProfileAction(ActionEvent actionEvent) {
        profilePane.setVisible(true);
        homePane.setVisible(false);
        panierPane.setVisible(false);
    }
}