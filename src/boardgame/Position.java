package boardgame;

public class Position {
	private int row;
	private int column;
	
	// Constructor
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	// Getters and Setters
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return "Position = " + row + ", " + column + ".";
	}
	
	// Set Value
	public void setValues(int wor, int column) {
		
	}
}
