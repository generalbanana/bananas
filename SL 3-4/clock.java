import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.shape.Line;
import java.io.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.text.*;


public class clock extends Application {
  public static void main(String[] args) {
    System.out.println("Launching Application mabye");
    launch(args);
  }
  public void start(Stage stage) {
    stage.setTitle("Clock");
    Group root = new Group();
    Canvas canvas = new Canvas(800, 600);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    root.getChildren().addAll(canvas);



    stage.setScene(new Scene(root));
    stage.show();

    new AnimationTimer(){
      public void handle(long x){
        long sec = System.nanoTime();
        long time = (x - sec) / 1000000000;
        long offset = gettime();
        time += offset;
        System.out.println(time);

        drawclock(gc);
        drawsecond(gc, time);
        drawminute(gc, time);
        drawhour(gc, time);
      }
    }.start();
  }
  public static long gettime(){
    long hour = (Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
    long minute = (Calendar.getInstance().getTimeInMillis())/(60000) % 60;
    long second = (Calendar.getInstance().getTimeInMillis())/(1000) % 60;
    long offset = (hour * 3600) + (minute * 60) + second;
    return offset;
  }
  public void drawsecond(GraphicsContext gc, long time){
    double secx = 275 + (Math.cos(((Math.PI/30)*time)-Math.PI/2) * 200);
    double secy = 275 + (Math.sin(((Math.PI/30)*time)-Math.PI/2) * 200);
    gc.setStroke(Color.RED);
    gc.setLineWidth(1);
    gc.strokeLine(275, 275, secx, secy);
  }
  public void drawminute(GraphicsContext gc, long time){
    double minx = 275 + (Math.cos(((Math.PI/1800)*time)-Math.PI/2) * 150);
    double miny = 275 + (Math.sin(((Math.PI/1800)*time)-Math.PI/2) * 150);
    gc.setStroke(Color.WHITE);
    gc.setLineWidth(2);
    gc.strokeLine(275, 275, minx, miny);
  }
  public void drawhour(GraphicsContext gc, long time){
    double hourx = 275 + (Math.cos(((Math.PI/21600)*time)-Math.PI/2) * 100);
    double houry = 275 + (Math.sin(((Math.PI/21600)*time)-Math.PI/2) * 100);
    gc.setStroke(Color.WHITE);
    gc.setLineWidth(4);
    gc.strokeLine(275, 275, hourx, houry);
  }
  public void drawclock(GraphicsContext gc) {
    gc.setFill(Color.WHITE);
    gc.fillRect(0,0,550,550);

    gc.setFill(Color.SILVER);
    gc.setLineWidth(2);
    gc.fillRect(525, 200, 75, 150);
    for(int i = 0; i < 7; i++){
      gc.setStroke(Color.BLACK);
      gc.strokeLine(525, 200+(25*i), 600, 200+(25*i));
    }
    gc.setFill(Color.SILVER);
    gc.fillOval(0,0,550,550);

    gc.setFill(Color.BLACK);
    gc.setLineWidth(2);
    gc.fillOval(25,25,500,500);

    gc.setStroke(Color.WHITE);
    gc.setLineWidth(4);
    gc.strokeLine(275, 0+25, 250+25, 50+25);
    gc.strokeLine(500+25, 250+25, 450+25, 250+25);
    gc.strokeLine(250+25, 500+25, 250+25, 450+25);
    gc.strokeLine(0+25, 250+25, 50+25, 250+25);
    gc.strokeLine(375+25, 33.49+25, 362.5+25, 55.14+25);
    gc.strokeLine(466.5+25, 125+25, 444.85+25, 137.5+25);
    gc.strokeLine(466.5+25, 375+25, 444.85+25, 362.5+25);
    gc.strokeLine(375+25, 466.5+25, 362.5+25, 444.85+25);
    gc.strokeLine(125+25, 466.5+25, 137.5+25, 444.85+25);
    gc.strokeLine(33.49+25, 375+25, 55.15+25, 362.5+25);
    gc.strokeLine(33.49+25, 125+25, 55.15+25, 137.5+25);
    gc.strokeLine(125+25, 33.49+25, 137.5+25, 55.14+25);
    }
}
