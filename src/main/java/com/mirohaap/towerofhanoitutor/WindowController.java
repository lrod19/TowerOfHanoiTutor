package com.mirohaap.towerofhanoitutor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class WindowController {
    private boolean tf = false;
    @FXML
    private TextFlow tutorText;

    @FXML
    protected void onRestartButtonClick() {
        Text test = new Text(String.format("%f", Math.random()));
        tutorText.getChildren().clear();
        tutorText.getChildren().add(test);
    }
    @FXML
    protected void onTutorToggled() {
        tf = !tf;
        tutorText.getChildren().clear();
        Text test = new Text(String.format("%s", tf));
        tutorText.getChildren().add(test);
    }
}