import java.io.*;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.shape.ArcType;
import javafx.stage.*;
import javafx.geometry.*;

public class barcode extends Application {
    public static void main(String[] args) {
        System.out.println("Launching Application");
        launch(args);
    }
    Canvas canvas = new Canvas(1000, 1000);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    public void start(Stage myStage) {
        double xl = 5;
        double yl = 100;
        double xpos = 50;
        double ypos = 50;
        double gx = 2.5;
        double gy = 150;
        double gxpos = 7.5;
        double gypos = 50;
        String array[] = new String[12];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter UPC Code:");
        for(int i = 0; i < 12; i++){
          array[i] = in.next();
        }
        for(int i = 0; i < 12; i++){
          if(array[i].equals("0")){
            array[i] = "0001101";
          } else if(array[i].equals("1")){
            array[i] = "0011001";
          } else if(array[i].equals("2")){
            array[i] = "0010011";
          } else if(array[i].equals("3")){
            array[i] = "0111101";
          } else if(array[i].equals("4")){
            array[i] = "0100011";
          } else if(array[i].equals("5")){
            array[i] = "0110001";
          } else if(array[i].equals("6")){
            array[i] = "0101111";
          } else if(array[i].equals("7")){
            array[i] = "0111011";
          } else if(array[i].equals("8")){
            array[i] = "0110111";
          } else if(array[i].equals("9")){
            array[i] = "0001011";
          }
        }
        myStage.setTitle("Watican");
        Group rootNode = new Group();
        for (int i = 0; i < 11; i++) {
          if (i == 0) {
            guardbars(gxpos, gypos, gx, gy);
            xpos = 15;
            drawleft(xpos, ypos, xl, yl, array, i);
          } else if(i==1){
            xpos = 50;
            drawleft(xpos, ypos, xl, yl, array, i);
          } else if(i==2){
            xpos = 85;
            drawleft(xpos, ypos, xl, yl, array, i);
          } else if (i==3){
            xpos = 120;
            drawleft(xpos, ypos, xl, yl, array, i);
          } else if (i==4){
            xpos = 155;
            drawleft(xpos, ypos, xl, yl, array, i);
          } else if (i==5){
            xpos = 190;
            drawleft(xpos, ypos, xl, yl, array, i);
          } else if (i==6){
            gxpos = 225;
            guardbars(gxpos, gypos, gx, gy);
            xpos = 232.5;
            drawright(xpos, ypos, xl, yl, array, i);
          } else if (i==7){
            xpos = 275 - 7.5;
            drawright(xpos, ypos, xl, yl, array, i);
          } else if (i==8){
            xpos = 310 - 7.5;
            drawright(xpos, ypos, xl, yl, array, i);
          } else if (i==9){
            xpos = 345 - 7.5;
            drawright(xpos, ypos, xl, yl, array, i);
          } else if (i==10){
            xpos = 380 - 7.5;
            drawright(xpos, ypos, xl, yl, array, i);
          } else if (i==11){
            xpos = 415 - 7.5;
            drawright(xpos, ypos, xl, yl, array, i);
            gxpos = 442.5;
            guardbars(gxpos, gypos, gx, gy);
          }
        }
        rootNode.getChildren().add(canvas);
        Scene scene = new Scene(rootNode, 1000,1000);
        myStage.setScene(scene);
        myStage.show();
    }
    public void drawleft(double xpos, double ypos, double x, double y, String[] array, int j) {
      for(int i = 0; i < 7; i++) {
          xpos = xpos + (i * 5);
          if(array[j].charAt(i) == '0') {
          gc.setFill(Color.WHITE);
          gc.fillRect(xpos, ypos, x, y);
      } else if(array[j].charAt(i) == '1') {
          gc.setFill(Color.BLACK);
          gc.fillRect(xpos, ypos, x, y);
        }
      }
    }

    public void drawright(double xpos, double ypos, double x, double y, String[] array, int j) {
      for(int i = 0; i < 7; i++) {
        xpos = xpos + (i * 5);
        if(array[j].charAt(i) == '1') {
          gc.setFill(Color.WHITE);
          gc.fillRect(xpos, ypos, x, y);
        } else if(array[j].charAt(i) == '0') {
          gc.setFill(Color.BLACK);
          gc.fillRect(xpos, ypos, x, y);
        }
      }
    }

    public void guardbars(double xpos, double ypos, double x, double y) {
      gc.setFill(Color.BLACK);
      gc.fillRect(xpos, ypos, x, y);
      gc.setFill(Color.WHITE);
      gc.fillRect(xpos + 5, ypos, 2.5, y);
      gc.setFill(Color.BLACK);
      gc.fillRect(xpos + 7.5, ypos, x, y);
    }
  }
