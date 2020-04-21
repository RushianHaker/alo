package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class HelloController {

    int counter = 0;

    public boolean b = true;

    @FXML
    private Label HelloView;



    public void onClickHelloMethod(javafx.event.ActionEvent actionEvent) {

        do {
            counter++;
            HelloView.setText("Hello -> " + counter);
        }while (counter > 6);
    }
}
