package application;
import boardgame.Board;
import chess.ChessPiece;

public class UI {
	
	public static void printBoard(ChessPiece[][] pieces) {
		
		System.out.println();
		for(int i = 0 ; i<pieces.length;i++) {
			
			System.out.printf("%c %d %c",Constant.TAB,(Board.NUMBER_OF_ROWS-i),Constant.BLANK_SPACE);
			for(int j = 0 ; j<pieces.length ; j++)
				printPiece(pieces[i][j]);
			System.out.println();
		
		}
		System.out.printf("%c %sa b c d e f g h",Constant.TAB,Constant.DOUBLE_SPACE);
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null)
			System.out.print(Constant.HYPHEN);
		else
			System.out.print(piece);
		System.out.print(Constant.BLANK_SPACE);
	}

}
