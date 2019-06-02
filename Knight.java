/*
* Name:
* Section Leader:
* File: Knight.java
* ------------------
* This class represents the Knight type of chess piece. This piece can move only in
* L-shapes. That is it moves two spaces in one direction and one space in an orthogonal
* direction. It is the only piece in chess that can jump over other pieces. For
* more information go here: http://en.wikipedia.org/wiki/Knight_(chess)
*/

public class Knight extends ChessPiece{

	/** Constructor for the Knight class */
	public Knight(int initialRow, int initialCol, int pieceColor)
	{
		this.row = initialRow;
		this.col = initialCol;
		this.color = pieceColor;
	}

	/** Method that returns a boolean indicating whether or not the king can legally move
	*  to the specified location (you need to fill this one in).
	*/
	public boolean canMoveTo(int nextRow, int nextCol, ChessBoard board)
	{
		int diffX = Math.abs(initialRow - nextRow);
		int diffY = Math.abs(initialCol - nextCol);

		if(!isOnBoard(board, nextRow, nextCol)){
			return false;
		}
		if((diffX ==1 && diffY == 2) || (diffX == 2 && diffY == 1)){
			return true;
		}
		else{
			return false;
		}
	}


	"
	/**
	* Verify that piece is on board
	* @param board
	* @param nextRow
	* @param nextCol
	* @return
	*/
	public boolean isOnBoard(Board board, int nextRow, int toY){
		/* Cannot move to position currently occupying */
		if(initialRow == nextRow && initialCol == nextCol){
			return false;
		}
		/* Prevent moving out of Board */
		if(initialRow < 0 || initialCol < 0 || initialRow > 7 ||
		initialCol > 7 || nextRow < 0 || nextCol < 0 || nextRow > 7 ||
		nextCol > 7){
			return false;
		}
		else return true;
	}
	"


	/** Implementation of getType() method for the Knight class. Provides a way to identify
	*  the Knight-type chess piece as such (you don't need to change anything here)
	*/
	public PieceType getType()
	{
		return PieceType.KNIGHT;
	}

}
