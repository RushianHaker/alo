package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class Controller {

    private Model model = new Model();

    @FXML
    private Text output;

    private int i = 0;

    private long number1 = 0;

    private String operator = "";

    private boolean start = true;

    @FXML
    public void processNumpad(ActionEvent event) {
        if (start) {
            output.setText("");
            start = false;
        }

        String value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
        i++;

        if (i == 7) inputLimitation();

    }


    @FXML
    public void inputLimitation() {
        output.setText("Больше 6 вводить нельзя!");
        start = true;
        i = 0;
    }


    @FXML
    public void processOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operator.isEmpty())
                return;

            operator = value;
            number1 = Long.parseLong(output.getText());
            output.setText("");
            i = 0;
        } else {
            if (operator.isEmpty())
                return;

            output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }
}
