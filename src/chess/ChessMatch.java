package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	
	
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean check,checkMate;
	private ChessPiece enPassantVulnerable, promoted;
	
	public ChessMatch() {
		board = new Board (Board.NUMBER_OF_ROWS,Board.NUMBER_OF_COLLUMNS);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		int col = board.getCollumns(),row = board.getRows();
		ChessPiece[][] mat = new ChessPiece[row][col];
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col ; j++)
				mat[i][j] = (ChessPiece) board.piece(i, j);
		return mat; 
		
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));

	}
}
