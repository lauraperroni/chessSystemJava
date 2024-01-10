package boardgame;

public class Board {
	private int rows;			 // quantidade de linhas
	private int columns; 		//quantidade de colunas
	private Piece[][] pieces;  //Matriz de pe�as do tabuleiro
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}