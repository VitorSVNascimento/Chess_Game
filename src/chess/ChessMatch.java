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
	
	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new King(board, Color.WHITE), new Position (0,4));
		board.placePiece(new King(board, Color.BLACK), new Position (7,4));
	}
}
