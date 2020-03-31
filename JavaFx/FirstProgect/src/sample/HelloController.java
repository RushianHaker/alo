package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    int counter = 0;

    @FXML
    private Button HelloButton;

    @FXML
    private Label HelloView;

    @FXML
    public void onClickHelloMethod(javafx.event.ActionEvent actionEvent) {
        counter++;
        HelloView.setText("Hello -> " + counter);
    }
}
