import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.*;

/**
 * @class: Main
 * @author: Elias Kalkhofer
 * @date: 15.10.2020
 */

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage st) throws Exception {

        VBox root = new VBox();
        ObservableList root_list = root.getChildren();

        Label l1 = new Label("Grad Celsius");
        l1.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold;");
        root_list.add(l1);

        TextField tf1 = new TextField();
        tf1.setPromptText("Wert");
        tf1.setPrefHeight(20);
        tf1.setMaxWidth(250);
        tf1.setStyle("-fx-font-size: 16px;");
        root_list.add(tf1);

        Label l2 = new Label("Grad Fahrenheit");
        l2.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold;");
        root_list.add(l2);

        TextField tf2 = new TextField();
        tf2.setPromptText("Wert");
        tf2.setPrefHeight(20);
        tf2.setMaxWidth(250);
        tf2.setStyle("-fx-font-size: 16px;");
        root_list.add(tf2);

        Scene scene = new Scene(root, 600, 400);
        st.setTitle("Temp. Converter");
        st.setScene(scene);
        st.show();
    }
}
