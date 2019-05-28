/*
 * Name:
 * Section Leader:
 * File: Rook.java
 * ------------------
 * This class represents the Rook type of chess piece. This piece can move and capture 
 * pieces along rows and columns. It is also known as a castle. For more information visit: 
 * http://en.wikipedia.org/wiki/Rook_(chess)
 */

public class Rook extends ChessPiece{

	/** Constructor for the Rook class */
	public Rook(int initialRow, int initialCol, int pieceColor)
	{
		this.row = initialRow;
		this.col = initialCol;
		this.color = pieceColor;
	}	

	/** Method that returns a boolean indicating whether or not the bishop can legally move
	 *  to the specified location, accepts nextRow/Col from 
	 */
	public boolean canMoveTo(int nextRow, int nextCol, ChessBoard board)
	{
		// Fill this in with your own code.
		if (this.row == nextRow || this.col == nextCol) {
			if (nextCol <= 8 && nextCol >= 1 && nextRow <= 8 && nextRow >= 1)
				return true;
		}
		return false;
	}

	/** Implementation of getType() method for the Rook class. Provides a way to identify
	 *  the Rook-type chess piece as such (you don't need to change anything here)
	 */
	public PieceType getType() 
	{
		return PieceType.ROOK;
	}

}
