package com.mirohaap.towerofhanoitutor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class WindowController {
    @FXML
    private TextFlow tutorText;

    @FXML
    protected void onRestartButtonClick() {
        tutorText.getChildren().remove(test);
        tutorText.getChildren().add(test);
    }
    private Text test = new Text("Testing Testing 123");
}