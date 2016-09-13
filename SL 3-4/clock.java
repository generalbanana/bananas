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

public class clock extends Application {
  public static void main(String[] args) {
    System.out.println("Launching Application mabye");
    Calendar cal = Calendar.getInstance();
    launch(args);
  }
  public void start(Stage stage) {
    double xpos= 0, ypos = 0;
    stage.setTitle("Clock");
    Group root = new Group();
    Canvas canvas = new Canvas(800, 600);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    Circle circle = new Circle(250, 250, 250);
    Line one = new Line(250, 0, 250, 50);
    one.setStrokeWidth(4);
    one.setStroke(Color.WHITE);
    Line two = new Line(288.675, 0, 288.675, 50);
    two.setStrokeWidth(4);
    two.setStroke(Color.WHITE);


    Timeline timeline = new Timeline();

    root.getChildren().addAll(circle, one);
    stage.setScene(new Scene(root));
    stage.show();
  }
}
