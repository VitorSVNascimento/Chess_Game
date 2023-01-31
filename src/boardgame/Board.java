package boardgame;

public class Board {
	
	public static final int NUMBER_OF_ROWS = 8,NUMBER_OF_COLLUMNS = 8;
	
	private int rows,collumns;
	private Piece pieces[][];

	public Board(int rows, int collumns) {
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCollumns() {
		return collumns;
	}

	public void setCollumns(int collumns) {
		this.collumns = collumns;
	}
	
	public Piece piece(int row,int collumn) {
		return pieces[row][collumn];
		
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
		
	}
	
	public void placePiece (Piece piece, Position position) {
	
		pieces[position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
	}
	
	
}
