package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;

import java.io.*;
import java.net.Socket;

public class Main extends Application {

    DataOutputStream toServer = null;
    DataInputStream fromServer = null;

    @Override
    public void start(Stage primaryStage) {
        TilePane tile = new TilePane();
        tile.setPadding(new Insets(5, 5, 5, 5));

        Scene scene = new Scene(tile, 450, 200);
        primaryStage.setTitle("DSF Client"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();
        try {
            Socket socket = new Socket("localhost", 8000);
            fromServer = new DataInputStream(socket.getInputStream());
            fromServer.read
        } catch (IOException ex) {
            ta.appendText(ex.toString() + '\n');
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
