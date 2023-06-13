package com.example.calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import com.example.calc.Operation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.fxml.FXML;

import java.io.IOException;



public class HelloApplication extends Application {
    private Label resultLabel;
    private double memory = 0;
    private double result = 0.0;
    private double currentNumber = 0.0;
    private double total = 0.0;
    private char operator = ' ';

    @FXML
    private Label memoryLabel;

    private double memoryValue;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {




        // Crée les boutons
        Button button0 = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button buttonPlus = new Button("+");
        Button buttonMinus = new Button("-");
        Button buttonTimes = new Button("X");
        Button buttonDivided= new Button("/");
        Button buttonEquals = new Button("=");
        Button buttonClear = new Button("C");
        Button buttonMemoryAdd = new Button("M+");
        Button buttonMemoryRemove = new Button("M-");
        Button buttonMemoryRead = new Button("MR");
        Button buttonMemoryClear = new Button("MC");
        Button buttonPercent = new Button("%");
        Button buttonDecimal = new Button(",");

        // Définit la taille des boutons
        button0.setMinSize(50, 50);
        button1.setMinSize(50, 50);
        button2.setMinSize(50, 50);
        button3.setMinSize(50, 50);
        button4.setMinSize(50, 50);
        button5.setMinSize(50 , 50);
        button6.setMinSize(50 , 50);
        button7.setMinSize(50 , 50);
        button8.setMinSize(50 , 50);
        button9.setMinSize(50 , 50);
        buttonPlus.setMinSize(75 , 50);
        buttonMinus.setMinSize(75 , 50);
        buttonTimes.setMinSize(75 , 50);
        buttonDivided.setMinSize(75 , 50);
        buttonPercent.setMinSize(75 , 50);
        buttonDecimal.setMinSize(50 , 50);
        buttonEquals.setMinSize(100 , 50);
        buttonClear.setMinSize(75 , 50);
        buttonMemoryAdd.setMinSize(75 , 50);
        buttonMemoryRemove.setMinSize(75 , 50);
        buttonMemoryRead.setMinSize(75 , 50);
        buttonMemoryClear.setMinSize(75 , 50);


        // Définit la couleur des boutons
        button0.setStyle("-fx-background-color: #FFFFFF;");
        button1.setStyle("-fx-background-color: #FFFFFF;");
        button2.setStyle("-fx-background-color: #FFFFFF;");
        button3.setStyle("-fx-background-color: #FFFFFF;");
        button4.setStyle("-fx-background-color: #FFFFFF;");
        button5.setStyle("-fx-background-color: #FFFFFF;");
        button6.setStyle("-fx-background-color: #FFFFFF;");
        button7.setStyle("-fx-background-color: #FFFFFF;");
        button8.setStyle("-fx-background-color: #FFFFFF;");
        button9.setStyle("-fx-background-color: #FFFFFF;");
        buttonPlus.setStyle("-fx-background-color: #FFFFFF;");
        buttonMinus.setStyle("-fx-background-color: #FFFFFF;");
        buttonTimes.setStyle("-fx-background-color: #FFFFFF;");
        buttonDivided.setStyle("-fx-background-color: #FFFFFF;");
        buttonPercent.setStyle("-fx-background-color: #FFFFFF;");
        buttonDecimal.setStyle("-fx-background-color: #FFFFFF;");
        buttonEquals.setStyle("-fx-background-color: #008000;");
        buttonEquals.setStyle("-fx-text-fill: #008000;");
        buttonClear.setStyle("-fx-background-color: #FF0000;");
        buttonClear.setStyle("-fx-text-fill: #FF0000;");
        buttonMemoryAdd.setStyle("-fx-text-fill: #000000;");
        buttonMemoryAdd.setStyle("-fx-background-color: #0079ff;");
        buttonMemoryRemove.setStyle("-fx-text-fill: #000000;");
        buttonMemoryRemove.setStyle("-fx-background-color: #ff6700;");
        buttonMemoryRead.setStyle("-fx-text-fill: #000000;");
        buttonMemoryRead.setStyle("-fx-background-color: #00ff24;");
        buttonMemoryClear.setStyle("-fx-text-fill: #000000;");
        buttonMemoryClear.setStyle("-fx-background-color: #ff0000;");


        // Positionne les boutons dans l'AnchorPane
        AnchorPane.setTopAnchor(button0, 430.0);
        AnchorPane.setLeftAnchor(button0, 200.0);

        AnchorPane.setTopAnchor(button1, 360.0);
        AnchorPane.setLeftAnchor(button1, 100.0);

        AnchorPane.setTopAnchor(button2, 360.0);
        AnchorPane.setLeftAnchor(button2, 200.0);

        AnchorPane.setTopAnchor(button3, 360.0);
        AnchorPane.setLeftAnchor(button3, 300.0);

        AnchorPane.setTopAnchor(button4, 300.0);
        AnchorPane.setLeftAnchor(button4, 100.0);

        AnchorPane.setTopAnchor(button5, 300.0);
        AnchorPane.setLeftAnchor(button5, 200.0);

        AnchorPane.setTopAnchor(button6, 300.0);
        AnchorPane.setLeftAnchor(button6, 300.0);

        AnchorPane.setTopAnchor(button7, 240.0);
        AnchorPane.setLeftAnchor(button7, 100.0);

        AnchorPane.setTopAnchor(button8, 240.0);
        AnchorPane.setLeftAnchor(button8, 200.0);

        AnchorPane.setTopAnchor(button9, 240.0);
        AnchorPane.setLeftAnchor(button9, 300.0);

        AnchorPane.setTopAnchor(buttonEquals, 430.0);
        AnchorPane.setLeftAnchor(buttonEquals, 375.0);

        AnchorPane.setTopAnchor(buttonPlus, 360.0);
        AnchorPane.setLeftAnchor(buttonPlus, 400.0);

        AnchorPane.setTopAnchor(buttonMinus, 300.0);
        AnchorPane.setLeftAnchor(buttonMinus, 400.0);

        AnchorPane.setTopAnchor(buttonTimes, 240.0);
        AnchorPane.setLeftAnchor(buttonTimes, 400.0);

        AnchorPane.setTopAnchor(buttonDivided, 180.0);
        AnchorPane.setLeftAnchor(buttonDivided, 400.0);

        AnchorPane.setTopAnchor(buttonPercent, 180.0);
        AnchorPane.setLeftAnchor(buttonPercent, 300.0);

        AnchorPane.setTopAnchor(buttonDecimal, 430.0);
        AnchorPane.setLeftAnchor(buttonDecimal, 300.0);

        AnchorPane.setTopAnchor(buttonClear, 180.0);
        AnchorPane.setLeftAnchor(buttonClear, 100.0);

        AnchorPane.setTopAnchor(buttonMemoryAdd, 180.0);
        AnchorPane.setLeftAnchor(buttonMemoryAdd, 10.0);

        AnchorPane.setTopAnchor(buttonMemoryRemove, 240.0);
        AnchorPane.setLeftAnchor(buttonMemoryRemove, 10.0);

        AnchorPane.setTopAnchor(buttonMemoryRead, 300.0);
        AnchorPane.setLeftAnchor(buttonMemoryRead, 10.0);

        AnchorPane.setTopAnchor(buttonMemoryClear, 360.0);
        AnchorPane.setLeftAnchor(buttonMemoryClear, 10.0);




        // Définit les fonctions lors du clic des boutons
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 0 cliqué !");
                resultLabel.setText(resultLabel.getText() + "0");
            }
        });

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 1 cliqué !");
                resultLabel.setText(resultLabel.getText() + "1");
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 2 cliqué !");
                resultLabel.setText(resultLabel.getText() + "2");
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 3 cliqué !");
                resultLabel.setText(resultLabel.getText() + "3");
            }
        });

        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 4 cliqué !");
                resultLabel.setText(resultLabel.getText() + "4");
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 5 cliqué !");
                resultLabel.setText(resultLabel.getText() + "5");
            }
        });

        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 6 cliqué !");
                resultLabel.setText(resultLabel.getText() + "6");
            }
        });

        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 7 cliqué !");
                resultLabel.setText(resultLabel.getText() + "7");
            }
        });

        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 8 cliqué !");
                resultLabel.setText(resultLabel.getText() + "8");
            }
        });

        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Bouton 9 cliqué !");
                resultLabel.setText(resultLabel.getText() + "9");
            }
        });

        buttonPlus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Plus !");
                double num = Double.parseDouble(resultLabel.getText());
                total += num;
                resultLabel.setText("");
                operator = '+';
            }
        });

        buttonMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Minus !");
                double num = Double.parseDouble(resultLabel.getText());
                total += num;
                resultLabel.setText("");
                operator = '-';
            }
        });

        buttonTimes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Times !");
                double num = Double.parseDouble(resultLabel.getText());
                total += num;
                resultLabel.setText("");
                operator = '*';
            }
        });

        buttonDivided.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Divided by !");
                double num = Double.parseDouble(resultLabel.getText());
                total += num;
                resultLabel.setText("");
                operator = '/';
            }
        });

        buttonPercent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Percent of !");
                double num = Double.parseDouble(resultLabel.getText());
                total += num;
                resultLabel.setText("");
                operator = '%';
            }
        });
        buttonDecimal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!resultLabel.getText().contains(".")) {
                    resultLabel.setText(resultLabel.getText() + ".");
                }
            }
        });

        buttonMemoryAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double num = Double.parseDouble(resultLabel.getText());
                // Stocker la valeur dans la mémoire (exemple avec une variable de classe)
                memory += num;
                resultLabel.setText("");
                System.out.println("memory added");
            }
        });

        buttonMemoryRead.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                resultLabel.setText(resultLabel.getText() + memory);

            }
        });

        buttonMemoryClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                memory = 0;
                resultLabel.setText("");

            }
        });




        buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Egal !");
                BigDecimal num = new BigDecimal(resultLabel.getText());
                BigDecimal totalValue = new BigDecimal(total);
                BigDecimal result;

                switch (operator) {
                    case '+':
                        result = totalValue.add(num);
                        break;
                    case '-':
                        result = totalValue.subtract(num);
                        break;
                    case '*':
                        result = totalValue.multiply(num);
                        break;
                    case '/':
                        result = totalValue.divide(num, 10, RoundingMode.HALF_UP);
                        break;
                    case '%':
                        result = totalValue.divide(new BigDecimal(100), 10, RoundingMode.HALF_UP).multiply(num);
                        break;
                    default:
                        result = num;
                        break;
                }

                total = 0.0;
                resultLabel.setText(result.stripTrailingZeros().toPlainString());
                operator = ' ';
            }
        });




        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Effacé");
                resultLabel.setText(""); // Efface le contenu du resultLabel
                result = 0.0; // Réinitialise la variable result à zéro
            }
        });







        // Crée l'AnchorPane et ajoute les boutons
        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(button0, button1, button2, button3, button4
                , button5, button6, button7, button8, button9
                , buttonPlus, buttonMinus, buttonTimes, buttonDivided, buttonEquals
                , buttonDecimal, buttonClear, buttonMemoryAdd, buttonMemoryRemove, buttonMemoryRead,
                buttonMemoryClear, buttonPercent );


        // Crée le label d'affichage des valeurs
        resultLabel = new Label();
        resultLabel.setStyle("-fx-font-size: 144px;");
        resultLabel.setStyle("-fx-background-color: #EDEDED;");
        AnchorPane.setTopAnchor(resultLabel, 100.0);
        AnchorPane.setLeftAnchor(resultLabel, 100.0);
        root.getChildren().add(resultLabel);

        // Crée la scène et affiche la fenêtre
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        // Définit le titre de la fenêtre
        primaryStage.setTitle("Calc u later");


        primaryStage.show();
    }




    public void Operation() {
        double num = Double.parseDouble(resultLabel.getText());
        total += num;
        resultLabel.setText(String.valueOf(total));
    }


}