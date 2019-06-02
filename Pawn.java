/*
 * Name:
 * Section Leader:
 * File: Pawn.java
 * ------------------
 * This class represents the Pawn type of chess piece. This piece can move only straight
 * forward (away from your side toward the other side). In can normally move only one space
 * at a time, except on the first move, when it has the option of moving two spaces. The pawn,
 * although it moves only forward, captures only diagonally forward. Turns out, this makes it
 * the most difficult to implement in code (fair warning). For more information go
 * here: http://en.wikipedia.org/wiki/Pawn_(chess)
 */

public class Pawn extends ChessPiece{

	/** Constructor for the Pawn class */
	public Pawn(int initialRow, int initialCol, int pieceColor)
	{
		this.row = initialRow;
		this.col = initialCol;
		this.color = pieceColor;
	}

	/** Method that returns a boolean indicating whether or not the pawn can legally move
	 *  to the specified location (you need to fill this one in).
	 *
	 *  Assumes color 0 starts on row 6, color 1 starts on row 1
	 */
	public boolean canMoveTo(int nextRow, int nextCol, ChessBoard board)
	{
		if (nextCol >= 7 || nextCol <= 0 || nextRow >= 7 || nextRow <= 0)
			return false;
		
		allowedDist = 1;
		dist = Math.pow(-1, this.color)*(this.row-nextRow)

		if (this.col == nextCol) {
			if ((this.color == 1 && this.row == 1) || (this.color == 0 && this.row == 6))
				allowedDist == 2;

			if (dist == allowedDist)
				return true;
		}

		else if (Math.abs(this.col - nextCol) == 1) {
			if (dist != allowedDist)
				return false;

			pieceAt = board.pieceAt(nextRow, nextCol);

			if (pieceAt.color != this.color)
				return true;
		}

		return false;
	}

	/** Implementation of getType() method for the Pawn class. Provides a way to identify
	 *  the Pawn-type chess piece as such (you don't need to change anything here)
	 */
	public PieceType getType()
	{
		return PieceType.PAWN;
	}

}
