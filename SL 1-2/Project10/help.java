import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.Group;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.*;

public class help extends Application {
    public static void main(String[] args) {
        System.out.println("Launching Application");
        //Start the JavaFX Application
        launch(args);
    }

    public void init() {
        //Put Stuff for the init method here
    }

    public void start(Stage myStage) {
        double xl = 5;
        double yl = 100;
        double xpos = 50;
        //Inside the start method
        //Give Stage a Title
        myStage.setTitle("JavaFX doot doot");
        //Create a root node, in this case a flow layout
        Group rootNode = new Group();
        //Create a scene
        Canvas canvas = new Canvas(600, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        left1(gc, xpos, xl, yl);
        //Label
        rootNode.getChildren().add(canvas);
        myStage.setScene(new Scene(rootNode));
        myStage.show();

    }

    private void drawShapes(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(5);
        gc.strokeLine(10, 50, 10, 10);
        gc.strokeLine(20, 50, 20, 10);

    }

    private void left0(GraphicsContext gc, double xpos, double x, double y){
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(xpos, 50, x, y);
        gc.strokeRect(xpos + 5,50,x,y);
        gc.strokeRect(xpos + 10,50,x,y);
        gc.fillRect(xpos + 15,50,x,y);
        gc.fillRect(xpos + 20,50,x,y);
        gc.strokeRect(xpos + 25,50,x,y);
        gc.fillRect(xpos + 30,50,x,y);
    }
    private void left1(GraphicsContext gc, double x, double y){
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(xpos, 50, x, y);
        gc.strokeRect(xpos + 5,50,x,y);
        gc.fillRect(xpos + 10,50,x,y);
        gc.fillRect(xpos + 15,50,x,y);
        gc.strokeRect(xpos + 20,50,x,y);
        gc.strokeRect(xpos + 25,50,x,y);
        gc.fillRect(xpos + 30,50,x,y);
    }
    private void left2(GraphicsContext gc, double x, double y){
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(xpos, 50, x, y);
        gc.strokeRect(xpos + 5,50,x,y);
        gc.fillRect(xpos + 10,50,x,y);
        gc.strokeRect(xpos + 15,50,x,y);
        gc.strokeRect(xpos + 20,50,x,y);
        gc.fillRect(xpos + 25,50,x,y);
        gc.fillRect(xpos + 30,50,x,y);
    }
    private void left3(GraphicsContext gc, double x, double y){
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(xpos, 50, x, y);
        gc.fillRect(xpos + 5,50,x,y);
        gc.fillRect(xpos + 10,50,x,y);
        gc.fillRect(xpos + 15,50,x,y);
        gc.fillRect(xpos + 20,50,x,y);
        gc.strokeRect(xpos + 25,50,x,y);
        gc.fillRect(xpos + 30,50,x,y);
    }
    private void left4(GraphicsContext gc, double x, double y){
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(1);
        gc.strokeRect(xpos, 50, x, y);
        gc.strokeRect(xpos + 5,50,x,y);
        gc.fillRect(xpos + 10,50,x,y);
        gc.strokeRect(xpos + 15,50,x,y);
        gc.strokeRect(xpos + 20,50,x,y);
        gc.fillRect(xpos + 25,50,x,y);
        gc.fillRect(xpos + 30,50,x,y);
    }


    public void stop() {
        //Put stuff for the stop method here
    }
}
