package chess;

import application.Constant;
import application.ErrorMessage;
import boardgame.Board;
import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		
		if(column < 'a' || column > 'h' || row < 1 || row > 8)
			throw new ChessException(ErrorMessage.CHESS_POSITION_IVALID);
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		
		return new Position(Board.NUMBER_OF_ROWS - row, column - Constant.CHAR_INITIAL);
	}

	protected static ChessPosition formPosition(Position position) {
		return new ChessPosition((char)(Constant.CHAR_INITIAL - position.getCollumn()), Board.NUMBER_OF_COLLUMNS - position.getRow());
	}

	@Override
	public String toString() {
		return String.format("%c%d", column,row);
	}
	
	
	
	
	
}
