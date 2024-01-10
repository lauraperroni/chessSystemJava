package boardgame;

public class Piece {
	protected Position position; // uma peça tem uma posição
	private Board board;		// essa posição é de um board
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //posição de uma peça recém criada precisa ser nulo
	}


	protected Board getBoard() {  //não pode alterar o tabuleiro, por isso só tem get protected, para 
		return board;   		  //que as classes e subclasses do pacote possam acessar
	}
}
