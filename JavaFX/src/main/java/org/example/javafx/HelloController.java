package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label label;

    @FXML
    private TextField textField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Elo cwele");
    }

    @FXML
    protected void pedaly(){
        String textFieldText = textField.getText();
        label.setText(textFieldText);
    }
}