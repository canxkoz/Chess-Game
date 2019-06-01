/*
* Name:
* Section Leader:
* File: King.java
* ------------------
* This class represents the King type of chess piece. This piece can move (and capture) one
* space in any direction. If you lose it, you lose the game. For more information go here:
* http://en.wikipedia.org/wiki/King_(chess)
*/

public class King extends ChessPiece{

	/** Constructor for the King class */
	public King(int initialRow, int initialCol, int pieceColor)
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
		public boolean isValidMove(Board board, int toX, int toY) {
			int diffX = Math.abs(nextRow - initialRow);
			int diffY = Math.abs(nextCol - initialCol);

			if (!isOnBoard(board, nextRow, nextCol)) {
				return false;
			}
			/* Rook Movement without collisions */
			if((diffX == 0 || diffY == 0)){
				return true;
			}
			else return false;
		}
	}

	//Notes to Jacob:
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
		/*Hello Jacob, I hope you are doing well. While I was working on the methods
		I realized that almost all of the methods extend "ChessPeace", Almost all of
		the pieces have this problem whether they are on board or not. As all of the
		peaces have the same problem, do you think that we should create a
		ChessPeace.java ?


/** Implementation of getType() method for the King class. Provides a way to identify
*  the King-type chess piece as such (you don't need to change anything here)
*/
public PieceType getType()
{
	return PieceType.KING;
}

}
