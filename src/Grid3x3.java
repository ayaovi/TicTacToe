/**
 * @file Grid3x3.java 
 * @description represents a 3x3 mini-grid 
 * that will fit into a larger 3x3 grid.
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
	/**
	 * constructor
	 */
	public Grid3x3(int cell_dimension, int grid_index)
	{
		/** 
		 * the grid index translates to the position 
		 * of this grid in the bigger grid
		 */
		super();
		this.getRowConstraints().add(new RowConstraints(cell_dimension));
		this.getRowConstraints().add(new RowConstraints(cell_dimension));
		this.getRowConstraints().add(new RowConstraints(cell_dimension));
		this.getColumnConstraints().add(new ColumnConstraints(cell_dimension));
		this.getColumnConstraints().add(new ColumnConstraints(cell_dimension));
		this.getColumnConstraints().add(new ColumnConstraints(cell_dimension));

		this.add(new Cell(cell_dimension, grid_index, 0), 0, 0);
		this.add(new Cell(cell_dimension, grid_index, 1), 1, 0);
		this.add(new Cell(cell_dimension, grid_index, 2), 2, 0);
		this.add(new Cell(cell_dimension, grid_index, 3), 0, 1);
		this.add(new Cell(cell_dimension, grid_index, 4), 1, 1);
		this.add(new Cell(cell_dimension, grid_index, 5), 2, 1);
		this.add(new Cell(cell_dimension, grid_index, 6), 0, 2);
		this.add(new Cell(cell_dimension, grid_index, 7), 1, 2);
		this.add(new Cell(cell_dimension, grid_index, 8), 2, 2);

		this.setPrefSize(156, 156);
		this.setAlignment(Pos.CENTER);
		// this.setGridLinesVisible(true);
		this.setHgap(3.0);
		this.setVgap(3.0);
	}
}