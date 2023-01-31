package boardgame;

import application.ErrorMessage;

public class Board {
	
	public static final int NUMBER_OF_ROWS = 8,NUMBER_OF_COLLUMNS = 8;
	
	private int rows,collumns;
	private Piece pieces[][];

	public Board(int rows, int collumns) {
		if(rows < 1 || collumns < 1) 
			throw new BoardException(ErrorMessage.NUMBER_OF_COL_OR_ROW_INVALID);
			
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns];
	}

	public int getRows() {
		return rows;
	}

	public int getCollumns() {
		return collumns;
	}
	
	public Piece piece(int row,int collumn) {
		if(!positionExists(row, collumn))
			throw new BoardException(ErrorMessage.NOT_IN_BOARD);
			
		return pieces[row][collumn];
		
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position))
			throw new BoardException(ErrorMessage.NOT_IN_BOARD);
		return pieces[position.getRow()][position.getCollumn()];
		
	}
	
	public void placePiece (Piece piece, Position position) {
		if(thereIsAPiece(position))
			throw new BoardException(String.format("%s %s", ErrorMessage.ALREADY_A_PIECE_IN_POSITION,position));
		pieces[position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int collumn) {
		return row >= 0 && row <= rows && collumn >= 0 && collumn <= collumns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getCollumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position))
			throw new BoardException(ErrorMessage.NOT_IN_BOARD);
		return piece(position) != null;
	}
	
}
