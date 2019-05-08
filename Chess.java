/*
 * Name:
 * Section Leader:
 * File: Chess.java
 * ------------------
 * This program plays the game Chess.
 */

import java.awt.Color;
import java.awt.event.*;

/** The main class responsible for managing the chess game */
public class Chess extends GraphicsProgram{

	/** Object responsible for handling the graphical display on the screen */
	ChessDisplay display;
	
	/** Object that keeps track of the locations of all pieces */
	ChessBoard board;

	/** Method called before run responsible for initializing the ChessDisplay and 
	 *  ChessBoard objects */
	public void init()
	{
		display = ChessDisplay.getInstance(this);			// This line is required, don't change it
		board = new ChessBoard();
		
		display.useRealChessLabels(false);					// Use this method to change how the board is labeled
															// on the screen. Passing in true will label the board
															// like an official chessboard; passing in false will
															// label the board like it is indexed in an array and
															// in ChessDisplay.
	}
	
	/** The main method that runs the program */
	public void run()
	{
		// You fill this in.
	}
	
}

