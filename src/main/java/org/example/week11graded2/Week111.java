package org.example.week11graded2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;

public class Week111 extends Application {

    @Override
    public void start(Stage primaryStage) {

        //problem 5
//        Circle red = new Circle(30, Color.RED);
//        Circle yellow = new Circle(30, Color.YELLOW);
//        Circle green = new Circle(30, Color.GREEN);
//
//        for (Circle c : new Circle[]{red, yellow, green}) {
//            c.setStroke(Color.DARKGRAY);
//            c.setStrokeWidth(2);
//        }
//
//        red.setOpacity(1.0);
//        yellow.setOpacity(0.3);
//        green.setOpacity(0.3);
//
//        Text label = new Text("Stop");
//        label.setFont(Font.font("System", FontWeight.BOLD, 18));
//        label.setFill(Color.WHITE);
//
//        VBox vbox = new VBox(5, red, yellow, green, label);
//        vbox.setAlignment(Pos.CENTER);
//        vbox.setPadding(new Insets(20));
//
//        Scene scene = new Scene(vbox);
//        scene.setFill(Color.DARKGRAY);
//
//        primaryStage.setTitle("Traffic light");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        //problem 6
//        double r = 0.23;
//        double g = 0.50;
//        double b = 0.80;
//
//        Rectangle rect = new Rectangle(200, 200, new Color(r, g, b, 1));
//
//        Text rLabel = new Text(String.format("R: %.2f", r));
//        Text gLabel = new Text(String.format("G: %.2f", g));
//        Text bLabel = new Text(String.format("B: %.2f", b));
//
//        int ri = (int) Math.round(r * 255);
//        int gi = (int) Math.round(g * 255);
//        int bi = (int) Math.round(b * 255);
//        String hex = String.format("#%02X%02X%02X", ri, gi, bi);
//
//        Text hexLabel = new Text(hex);
//        hexLabel.setFont(Font.font("System", FontWeight.BOLD, 14));
//
//        VBox vbox = new VBox(8, rect, rLabel, gLabel, bLabel, hexLabel);
//        vbox.setAlignment(Pos.CENTER);
//        vbox.setPadding(new Insets(20));
//
//        Scene scene = new Scene(vbox, 300, 320);
//        primaryStage.setTitle("Color Mixer");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        //problem 7
//        Label nameLabel = new Label("Yusuf");
//        nameLabel.setFont(Font.font("System", FontWeight.BOLD, 16));
//        nameLabel.setStyle("-fx-text-fill: white;");
//
//        HBox top = new HBox(nameLabel);
//        top.setPadding(new Insets(12));
//        top.setStyle("-fx-background-color: #2C3E50;");
//        top.setAlignment(Pos.CENTER_LEFT);
//
//        GridPane grid = new GridPane();
//        grid.setHgap(10);
//        grid.setVgap(10);
//        grid.setPadding(new Insets(20));
//        grid.setAlignment(Pos.CENTER);
//
//        String[][] data = {
//                {"Department", "AI and Robotics"},
//                {"Year",       "1st Year"},
//                {"GPA",        "3.41"}
//        };
//
//        for (int i = 0; i < data.length; i++) {
//            Label key = new Label(data[i][0] + ":");
//            key.setFont(Font.font("System", FontWeight.BOLD, 13));
//            Label val = new Label(data[i][1]);
//            grid.add(key, 0, i);
//            grid.add(val, 1, i);
//        }
//
//        Label footer = new Label("New Uzbekistan University");
//        footer.setMaxWidth(Double.MAX_VALUE);
//        footer.setAlignment(Pos.CENTER);
//        footer.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");
//        footer.setPadding(new Insets(8));
//
//        BorderPane root = new BorderPane();
//        root.setTop(top);
//        root.setCenter(grid);
//        root.setBottom(footer);
//
//        primaryStage.setTitle("Profile card");
//        primaryStage.setScene(new Scene(root, 400, 250));
//        primaryStage.show();

        //problem 8
        Pane pane = new Pane();
        Line line = new Line(0, 0, 0, 0);

        line.setStroke(Color.GREEN);
        line.setStrokeWidth(3);
        line.endXProperty().bind(pane.widthProperty());
        line.endYProperty().bind(pane.heightProperty());

        pane.getChildren().add(line);

        primaryStage.setTitle("Diagonal line");
        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}