package boardgame;

public class Position {

	private int row,collumn;
	
	public Position(int row, int collumn) {
		setCollumn(collumn);
		setRow(row);
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollumn() {
		return collumn;
	}

	public void setCollumn(int collumn) {
		this.collumn = collumn;
	}

	@Override
	public String toString() {
		return String.format("%d , %d", row,collumn);
	}
	
	
	
}
