/**
 * @file Grid3x3.java 
 * @description Predictive approach state based RAT 
 * selection in a Heterogenous Wireless Network.
 * @author A.E. Djissenou
 * @version 15.11.2016
 **/

package games.ttt;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class Grid3x3 extends javafx.scene.layout.GridPane
{
	public Grid3x3(int cell_dimension)
	{
		super();
		this.getRowConstraints().add(new RowConstraints(cell_dimension));
		this.getRowConstraints().add(new RowConstraints(cell_dimension));
		this.getRowConstraints().add(new RowConstraints(cell_dimension));
		this.getColumnConstraints().add(new ColumnConstraints(cell_dimension));
		this.getColumnConstraints().add(new ColumnConstraints(cell_dimension));
		this.getColumnConstraints().add(new ColumnConstraints(cell_dimension));

		this.add(new Cell(cell_dimension), 0, 0);
		this.add(new Cell(cell_dimension), 0, 1);
		this.add(new Cell(cell_dimension), 0, 2);
		this.add(new Cell(cell_dimension), 1, 0);
		this.add(new Cell(cell_dimension), 1, 1);
		this.add(new Cell(cell_dimension), 1, 2);
		this.add(new Cell(cell_dimension), 2, 0);
		this.add(new Cell(cell_dimension), 2, 1);
		this.add(new Cell(cell_dimension), 2, 2);

		this.setPrefSize(156, 156);
		this.setAlignment(Pos.CENTER);
		this.setGridLinesVisible(true);
		this.setHgap(3.0);
		this.setVgap(3.0);
	}
}