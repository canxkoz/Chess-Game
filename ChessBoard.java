/*
 * Name:
 * Section Leader:
 * File: ChessBoard.java
 * ------------------
 * This class represents the ChessBoard. Its job is to keep track of where all
 * of the pieces are. Since we just learned about two-dimensional arrays, it
 * might be a good idea to use one here (just a hint). Currently, it doesn't do
 * anything, but it does have four methods for you to fill in. These are the only
 * required methods in this class. As long as these work, feel free to do whatever
 * else you want to get this class working.
 */

public class ChessBoard extends DrawableObject{

	/** Constant that sets the size of the chess board */
	public static final int BOARD_SIZE = 8;


	public ChessPiece[][] board;

	/** Constructor for the ChessBoard class (do whatever you want with this) */
	public ChessBoard()
	{
		board = new ChessPiece[BOARD_SIZE][BOARD_SIZE];
		// You fill this in.
	}

	/** Returns the ChessPiece currently residing at the specified row and
	 * column. If no piece exists at the specified location, should return
	 * null.
	 */
	public boolean ChessPiece pieceAt(int row, int col)
	{

		// This should eventually do something more than return null
		return board[row][col];
		return null;	// This should eventually do something more than return null (I found it, It must return a boolean.)

	}

	/** Adds the specified ChessPiece to the ChessBoard (hint: ChessPieces know their
	 * own rows and columns. You can use this to figure out where to place the piece)
	 */
	public void addPiece(ChessPiece piece)
	{
		// You fill this in.
		board[piece.row][piece.col] = piece;
	}

	/** Removes the piece at the specified location from the board.
	 */
	public void removePiece(int row, int col)
	{

		// You fill this in.
		board[row][col] = null;
		this.piece[xCoord][yCoord] = null;

	}

}
