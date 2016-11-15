/**
 * @file Grid3x3.java 
 * @description Predictive approach state based RAT 
 * selection in a Heterogenous Wireless Network.
 * @author A.E. Djissenou
 * @version 15.11.2016
 **/

package games.ttt;

import javafx.scene.control.Button;

public class Cell extends javafx.scene.control.Button
{
	private final int parent_grid_position;
	private final int position_in_parent_grid;

	public Cell(int dimension, int grid_position, int cell_position)
	{
		super();
		this.parent_grid_position = grid_position;
		this.position_in_parent_grid = cell_position;
		this.setMinHeight(dimension);
		this.setMinWidth(dimension);
	}
}