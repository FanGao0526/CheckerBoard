/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author GaoFan
 */
public class main extends Application {
    
    @Override

    public void start(Stage stage) throws Exception {

       

        FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));

        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Parent root=loader.load();

        FXMLDocumentController controller= (FXMLDocumentController)loader.getController();

        //Checkerboard default_board=new Checkerboard(8,8,600,600);

        Scene scene = new Scene(root);

       
//
//        AnchorPane ap=(AnchorPane) loader.load();
//        ap=default_board.build();
        //Scene scene = new Scene(ap);

       

        stage.setScene(scene);
        stage.setTitle("Checkerboard");

        stage.show();

        controller.ready(stage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
