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
	public Cell(int dimension)
	{
		super();
		this.setMinHeight(dimension);
		this.setMinWidth(dimension);
	}
}