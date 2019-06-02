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
	 *
	 *  TODO: check to see if there are any pieces on its path to the goal
	 */
	public boolean canMoveTo(int nextRow, int nextCol, ChessBoard board)
	{
		if (nextCol >= 7 || nextCol <= 0 || nextRow >= 7 || nextRow <= 0)
			return false;

		double slope;

		//Checking to see if position is allowed
		if (this.row == nextRow)
			slope = 0
		else
			slope = (this.col - nextCol)/(double(this.row-nextRow));

		if (Math.abs(slope) != 1 && slope != 0)
			return false;

		//Checks goal local
		ChessPiece piece = board.pieceAt(nextRow, nextCol)
		if (piece != null && piece.color == this.color)
			return false;

		//Checking path to goal location
		piece = null;
		if (this.row == nextRow || this.col == nextCol) {
			int d = (this.row == nextRow) ? nextCol : nextRow;
			for (int i = ((this.row == nextRow) ? this.col : this.row); i != d; ((d-i >= 0) ? i++ : i--)) {
				piece = (this.row == nextRow) ? board.pieceAt(this.row, i) : board.pieceAt(i, this.col);
				if (piece)
					return false;
			}
		}

		if (Math.abs(slope) == 1) {
			for (int i = this.row, j = this.col; this.row != nextRow; (slope == 1) ? (i++, j++) : (i--, j--)) {
				piece = board.pieceAt(i, j)
				if (piece)
					return false;
			}
		}
	}

	/** Implementation of getType() method for the Pawn class. Provides a way to identify
	 *  the Pawn-type chess piece as such (you don't need to change anything here)
	 */
	public PieceType getType()
	{
		return PieceType.QUEEN;
	}

}
