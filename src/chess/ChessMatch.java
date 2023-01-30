package chess;

import boardgame.Board;

public class ChessMatch {
	
	private final int NUMBER_OF_ROWS=8,NUMBER_OF_COLLUMNS=8;
	
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean check,checkMate;
	private ChessPiece enPassantVulnerable, promoted;
	
	public ChessMatch() {
		board = new Board (NUMBER_OF_ROWS,NUMBER_OF_COLLUMNS);
	}
	
	public ChessPiece[][] getPieces(){
		int col = board.getCollumns(),row = board.getRows();
		ChessPiece[][] mat = new ChessPiece[row][col];
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < col ; j++)
				mat[i][j] = (ChessPiece) board.piece(i, j);
		return mat;
		
	}
}
