package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	/*public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;
	}*/
	
}
