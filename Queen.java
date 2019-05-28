/*
 * Name:
 * Section Leader:
 * File: Queen.java
 * ------------------
 * This class represents the Queen type of chess piece. This piece can move and capture
 * in any straight line (diagonally, horizontally, or vertically). For more information go 
 * here: http://en.wikipedia.org/wiki/Queen_(chess)
 */

public class Queen extends ChessPiece{

	/** Constructor for the Queen class */
	public Queen(int initialRow, int initialCol, int pieceColor)
	{
		this.row = initialRow;
		this.col = initialCol;
		this.color = pieceColor;
	}	
	
	/** Method that returns a boolean indicating whether or not the queen can legally move
	 *  to the specified location (you need to fill this one in).
	 */
	public boolean canMoveTo(int nextRow, int nextCol, ChessBoard board)
	{
		double slope;
		if (this.row-nextRow == 0)
			return true;
		else
			slope = (this.col - nextCol)/(double(this.row-nextRow));
		if (Math.abs(slope) == 1 || slope == 0) {
			if (nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextRow <= 8))
				return true;
		}
		return false;
	}

	/** Implementation of getType() method for the Pawn class. Provides a way to identify
	 *  the Pawn-type chess piece as such (you don't need to change anything here)
	 */
	public PieceType getType() 
	{
		return PieceType.QUEEN;
	}
	
}
