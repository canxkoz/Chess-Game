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
		//checks to make sure that nextRow and nextCol are in bounds
		if (nextCol >= 7 || nextCol <= 0 || nextRow >= 7 || nextRow <= 0)
			return false;

		if (this.row == nextRow || this.col == nextCol) {
			ChessPiece piece = null;
			int d = (this.row == nextRow) ? nextCol : nextRow;

			//checks to see if there are any pieces on its path
			for (int i = ((this.row == nextRow) ? this.col : this.row); i != d; ((d-i >= 0) ? i++ : i--)) {
				piece = (this.row == nextRow) ? board.pieceAt(this.row, i) : board.pieceAt(i, this.col);
				if (piece)
					return false;
			}

			//checks to see if piece at goal local is of the same color
			piece = board.pieceAt(nextRow, nextCol);
			if (piece != null && piece.color == this.color)
				return false;

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
