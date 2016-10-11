import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;

public class sudokusolve extends Application {
  public static void main(String[] args) {
    System.out.println("Launching Application mabye");
    launch(args);
  }
  public void start(Stage stage){
    stage.setTitle("Sudoku Solver");
    Group root = new Group();
    Canvas canvas = new Canvas(800, 600);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    root.getChildren().addAll(canvas);
    int[][]board = new int[9][9];
    draw(board, gc);
    Button solve = new Button("Solve Puzzle");
    solve.setOnAction(new EventHandler<ActionEvent>() {
       @Override
       public void handle(ActionEvent event) {
           solve(board);
           gc.setFill(Color.WHITE);
           gc.fillRect(0,0,500,500);
           draw(board,gc);
    }});
    root.getChildren().addAll(solve);
    stage.setScene(new Scene(root));
    stage.show();
  }
  public static void draw(int[][] board, GraphicsContext gc){
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        gc.strokeText(String.valueOf(board[i][j]),10+(17*i),50+12+(17*j));
      }
    }
    for(int k = 0; k < 10; k++){
      if(k % 3 == 0){
        gc.setLineWidth(2);
      } else {
        gc.setLineWidth(1);
      }
      gc.strokeLine(5,50+(17*k),158,50+(17*k));
    }
    for(int k = 0; k < 10; k++){
      if(k % 3 == 0){
        gc.setLineWidth(2);
      } else {
        gc.setLineWidth(1);
      }
      gc.strokeLine(5+(17*k),50+0,5+(17*k),50+153);
    }
  }
  public static boolean solve(int[][]board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != 0) {
          continue;
        }
        for (int n = 1; n <= 9; n++) {
          if (istrue(board, i, j, n)) {
            board[i][j] = n;
            if (solve(board)) {
              return true;
            } else {
              board[i][j] = 0;
            }
          }
        } return false;
      }
    } return true;
  }
  public static boolean istrue(int[][] board, int i, int j, int n) {
    for(int k = 0; k < 9; k++) {
      if(board[k][j] == n || board[i][k] == n) {
        return false;
      }
      int r = (j/3) * 3;
      int c = (i/3) * 3;
      for(int x = 0; x < 3; x++){
        for(int y = 0; y < 3; y++){
          if(board[c+x][r+y] == n){
            return false;
          }
        }
      }
    } return true;
  }
}
