package boardgame;

public class Piece {
	protected Position position; // uma pe�a tem uma posi��o
	private Board board;		// essa posi��o � de um board
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //posi��o de uma pe�a rec�m criada precisa ser nulo
	}


	protected Board getBoard() {  //n�o pode alterar o tabuleiro, por isso s� tem get protected, para 
		return board;   		  //que as classes e subclasses do pacote possam acessar
	}
}
