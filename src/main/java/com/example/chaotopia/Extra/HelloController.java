package com.example.chaotopia.Extra;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/** This is generated by Javafx which we use to test setup */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}