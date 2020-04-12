package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {


    int number = 0;

    @FXML
    private Label NumbersLabel;

    @FXML
    private Button numberButton_7;

    @FXML
    private Button numberButton_4;

    @FXML
    private Button numberButton_1;

    @FXML
    private Button numberButton_0;

    @FXML
    private Button numberButton_8;

    @FXML
    private Button numberButton_5;

    @FXML
    private Button numberButton_2;

    @FXML
    private Button numberButton_9;

    @FXML
    private Button numberButton_6;

    @FXML
    private Button numberButton_3;

    @FXML
    private Button btnDot;

    @FXML
    private Button check;

    @FXML
    private Button element_X;

    @FXML
    private Button element_minys;

    @FXML
    private Button element_plus;


    public void none(){
        for (int i = 0; i < 7; i++) {
            //onClickMethod();
        }
    }

    public void onClickMethod(ActionEvent actionEvent) {

        NumbersLabel.setText("0");

        if (numberButton_1.getId().equals("numberButton_1")) {
            NumbersLabel.setText("1");
        } else if (numberButton_2.getId().equals("numberButton_2")) {
            NumbersLabel.setText("2");
        } else if (numberButton_3.getId().equals("numberButton_3")) {
            NumbersLabel.setText("3");
        } else if (numberButton_4.getId().equals("numberButton_4")) {
            NumbersLabel.setText("4");
        } else if (numberButton_5.getId().equals("numberButton_5")) {
            NumbersLabel.setText("5");
        } else if (numberButton_6.getId().equals("numberButton_6")) {
            NumbersLabel.setText("6");
        } else if (numberButton_7.getId().equals("numberButton_7")) {
            NumbersLabel.setText("7");
        } else if (numberButton_8.getId().equals("numberButton_8")) {
            NumbersLabel.setText("8");
        } else if (numberButton_9.getId().equals("numberButton_9")) {
            NumbersLabel.setText("9");
        }
    }

    public void deem(int num, int num2) {

        char x = '/';
        int answer = 0;

        if (x == '+') {
            answer = num + num2;
        } else if (x == '-') {
            answer = num - num2;
        } else if (x == '*') {
            answer = num * num2;
        } else {
            answer = num / num2;
        }
    }
}
