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
		int diffX = Math.abs(nextRow - initialRow);
		int diffY = Math.abs(nextCol - initialRow);

		if (nextCol >= 7 || nextCol <= 0 || nextRow >= 7 || nextRow <= 0){
			return false;
		}
		/* Diagonal Movement */
		if(diffX != diffY){
			return false;
		}
		else if(pieceInWayDiagonal(board, nextRow, nextCol)){
			return false;
		}
		else
		return true;
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
		  if(initialRow < 0 || initialCol < 0 || initialRow > 7 || initialCol > 7 || nextRow < 0 || nextCol < 0 || nextRow > 7 ||nextCol > 7){
							return false;
					}
					else return true;
			}
	"

	/**
	* Check if collision along diagonal path
	* @param board
	* @param nextRow
	* @param nextCol
	* @return
	*/
	public boolean pieceInWayDiagonal(board, nextRow, nextCol){

		/* if destination is larger than initial return 1 else -1 */
		int directionX = nextRow > initialRow ? 1 : -1;
		int directionY = nextCol > initialCol ? 1 : -1;

		/* Check if there is a piece in the path traveled */
		for(int i = 1; i < Math.abs(nextRow-initialRow)-1; ++i){
			if(board.pieceAt(initialRow+i*directionX, initialCol+i*directionY)){
				return false;
			}
		}
		return true;
	}

	/** Implementation of getType() method for the Bishop class. Provides a way to identify
	*  the Bishop-type chess piece as such (you don't need to change anything here)
	*/
	public PieceType getType()
	{
		return PieceType.BISHOP;
	}
}
