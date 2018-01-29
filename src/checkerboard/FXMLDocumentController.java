/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author GaoFan
 */
public class FXMLDocumentController implements Initializable {
    Stage stage=new Stage();
    @FXML
    private VBox vb;
    
    @FXML
    private MenuBar mb;

    //Checkerboard cb_current=new Checkerboard(8,8,vb.getWidth(),vb.getHeight());
    Checkerboard cb_current=new Checkerboard(8,8,600,371);
    private AnchorPane a=cb_current.build();
    @FXML
    private AnchorPane ap;
    //private AnchorPane a=cb_current.build();

    private ChangeListener<Number> listener=new ChangeListener<Number>(){
        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            double new_w=stage.getWidth();
            double new_h=stage.getHeight();
            System.out.println("Listener is triggered, new width is "+new_w+", new height is "+new_h+"\n");
        cb_current=new Checkerboard(cb_current.getNumRows(),cb_current.getNumCols(),vb.getWidth(),vb.getHeight()-mb.getHeight(),cb_current.getLightColor(),cb_current.getDarkColor());
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    };
    
    public void ready(Stage stage){
        this.stage=stage;
//        a.setLayoutX(0);
//        a.setLayoutY(0);
//        Checkerboardcb_current=new Checkerboard(8,8,600,371);
//        private AnchorPane a=cb_current.build();
        vb.getChildren().add(a);
//        stage.widthProperty().addListener(listener);
//        stage.heightProperty().addListener(listener);
          vb.widthProperty().addListener(listener);
          vb.heightProperty().addListener(listener);
    }
    
    @FXML
    private void handleSize16(ActionEvent event){
        System.out.println("Checkerboard Size is Changed");
        cb_current=new Checkerboard(16,16,vb.getWidth(),vb.getHeight()-mb.getHeight(),cb_current.getLightColor(),cb_current.getDarkColor());
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
    }

    
    @FXML
    private void handleSize3(ActionEvent event){
        System.out.println("Checkerboard Size is Changed");
        cb_current=new Checkerboard(3,3,vb.getWidth(),vb.getHeight()-mb.getHeight(),cb_current.getLightColor(),cb_current.getDarkColor());
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
    }
    @FXML
    private void handleSize10(ActionEvent event){
        System.out.println("Checkerboard Size is Changed");
        cb_current=new Checkerboard(10,10,vb.getWidth(),vb.getHeight()-mb.getHeight(),cb_current.getLightColor(),cb_current.getDarkColor());
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
    }
    @FXML
    private void handleSize8(ActionEvent event){
        System.out.println("Checkerboard Size is Changed");
        cb_current=new Checkerboard(8,8,vb.getWidth(),vb.getHeight()-mb.getHeight(),cb_current.getLightColor(),cb_current.getDarkColor());
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
    }

    
    @FXML
    private void handleColorBlue(ActionEvent event) {
        System.out.println("Color Changes to Blue");
        int row=cb_current.getNumRows();
        int col=cb_current.getNumCols();
        double h=cb_current.getHeight();
        double w=cb_current.getWidth();
        cb_current=new Checkerboard(row,col,vb.getWidth(),vb.getHeight()-mb.getHeight(),Color.SKYBLUE,Color.DARKBLUE);
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
        //label.setText("Hello World!");
    }
    
    @FXML
    private void handleColorDefault(ActionEvent event) {
        System.out.println("Color Changes to Blue");
        int row=cb_current.getNumRows();
        int col=cb_current.getNumCols();
//        double h=cb_current.getHeight();
//        double w=cb_current.getWidth();
        
        
        cb_current=new Checkerboard(row,col,vb.getWidth(),vb.getHeight()-mb.getHeight(),Color.RED,Color.BLACK);
        AnchorPane a=cb_current.build();
        vb.getChildren().remove(2);
        vb.getChildren().add(a);
        //label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        System.out.println("Initialized");
    }        
    
}
