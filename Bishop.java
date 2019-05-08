/*
 * Name:
 * Section Leader:
 * File: Bishop.java
 * ------------------
 * This class represents the Bishop type of chess piece. This piece can move and capture 
 * pieces along diagonals. For more information visit: http://en.wikipedia.org/wiki/Bishop_(chess)
 */

public class Bishop extends ChessPiece{

	/** Constructor for the Bishop class */
	public Bishop(int initialRow, int initialCol, int pieceColor)
	{
		this.row = initialRow;
		this.col = initialCol;
		this.color = pieceColor;
	}	
	
	/** Method that returns a boolean indicating whether or not the bishop can legally move
	 *  to the specified location (you need to fill this one in).
	 */
	public boolean canMoveTo(int nextRow, int nextCol, ChessBoard board)
	{
		// Fill this in with your own code.
		return automagicBishopCanMoveTo(nextRow, nextCol, board);	// Eventually this line should not be here
	}
	
	/** Implementation of getType() method for the Bishop class. Provides a way to identify
	 *  the Bishop-type chess piece as such (you don't need to change anything here)
	 */
	public PieceType getType() 
	{
		return PieceType.BISHOP;
	}
}
