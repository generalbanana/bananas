import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Line;
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


public class rotate extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 200);
        stage.setScene(scene);

        Circle circle = new Circle(100, 50, 50);

        GraphicsContext g2d = canvas.getGraphicsContext2D();
        drawClockFace();

        Line second = new Line (100, 100, 100, 0);
        second.setStrokeWidth(1);
        second.setStroke(Color.RED);

        RotateTransition rts = new RotateTransition(Duration.millis(600), second);
        rts.setByAngle(360);
        rts.setCycleCount(100);
        rts.setAutoReverse(false);

        Line minute = new Line (100, 100, 100, 0);
        minute.setStrokeWidth(2);
        minute.setStroke(Color.WHITE);

        RotateTransition rtm = new RotateTransition(Duration.millis(360000), minute);
        rtm.setByAngle(360);
        rtm.setCycleCount(100);
        rtm.setAutoReverse(false);

        Line hour = new Line (100, 100, 100, 0);
        hour.setStrokeWidth(4);
        hour.setStroke(Color.WHITE);

        RotateTransition rth = new RotateTransition(Duration.millis(2160000), hour);
        rth.setByAngle(360);
        rth.setCycleCount(100);
        rth.setAutoReverse(false);

        rts.play();
        rtm.play();
        rth.play();

        root.getChildren().addAll(circle, minute, second, hour);

        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    private void drawClockFace(Graphics2D g2d) {
   g2d.setPaint(Color.white);
   g2d.fill(new Arc2D.Double(-110, -110, 220, 220, 0,
      360, Arc2D.CHORD));
   g2d.setColor(Color.darkGray);
   g2d.setStroke(new BasicStroke(4.0f));
   g2d.draw(new Arc2D.Double(-110, -110, 220, 220, 0,
      360, Arc2D.CHORD));

   for (int i = 0; i < 60; i++) {
      if ((i % 5) != 0) {
         g2d.setStroke(new BasicStroke(1.0f));
         g2d.setColor(Color.darkGray);
         g2d.drawLine(92, 0, 96, 0);
      } else {
         g2d.setColor(new Color(255, 22, 10));
         g2d.setStroke(new BasicStroke(2.0f));
         g2d.drawLine(88, 0, 96, 0);
      }
      g2d.rotate((Math.PI / 180.0) * 6.0);
   }
}
}
