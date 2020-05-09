package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {

    String a = Singlton.getInstance().filePathFirst;
    String b = Singlton.getInstance().filePathSecond;
    String c = Singlton.getInstance().filePathThird;

    @FXML
    private Label output_1;

    @FXML
    private Label output_2;

    @FXML
    private Label output_3;

    @FXML
    private Button input_1;

    @FXML
    private Button input_2;

    @FXML
    private Button input_3;

    public Controller() throws IOException {
    }


    @FXML
    public void actionPerformed(ActionEvent e) {

        Button button = (Button) e.getSource();

        getText(button);
    }

    public void getText(Button button) {
        if (button == input_1) output_1.setText(a);
        else if (button == input_2) output_2.setText(b);
        else output_3.setText(c);
    }
}
