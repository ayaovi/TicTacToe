/**
 * @file TicTacToe.java 
 * @description Predictive approach state based RAT 
 * selection in a Heterogenous Wireless Network.
 * @author A.E. Djissenou
 * @version 15.11.2016
 **/

package games.ttt;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;
import javafx.stage.Stage;

public class TicTacToe extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Button button = new Button();
		// button.setText("This is not for children...");
		// button.setOnAction(e -> System.out.println("I am saying that I am back..."));

		// GridPane grid_1 = new GridPane();
		// gridpane.getColumnConstraints().add(new ColumnConstraints(100)); // column 1 is 100 wide
		// gridpane.getColumnConstraints().add(new ColumnConstraints(200)); // column 2 is 200 wide

		Grid3x3 mini_grid = new Grid3x3(50);

		GridPane root = new GridPane();
		// StackPane root = new StackPane();
		// root.getRowConstraints().add(new RowConstraints(155));
		// root.getColumnConstraints().add(new ColumnConstraints(155));

		root.setHgap(3.0);
		root.setVgap(3.0);

		root.add(new Grid3x3(50), 0, 0);
		root.add(new Grid3x3(50), 1, 0);
		root.add(new Grid3x3(50), 2, 0);
		root.add(new Grid3x3(50), 0, 1);
		root.add(new Grid3x3(50), 1, 1);
		root.add(new Grid3x3(50), 2, 1);
		root.add(new Grid3x3(50), 0, 2);
		root.add(new Grid3x3(50), 1, 2);
		root.add(new Grid3x3(50), 2, 2);
		// root.getChildren().add(mini_grid);

		Scene main_scene = new Scene(root, 306, 306);

		primaryStage.setTitle("TicTacToe it is !?");
		primaryStage.setScene(main_scene);
		primaryStage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}
}