package application;

import chess.ChessMatch;

public class ChessGame {

	public static void main(String[] args) {
		new ChessGame();
	}
	
	private ChessGame() {
		startChessGame();
		System.exit(0);
	}
	
	private void startChessGame() {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
