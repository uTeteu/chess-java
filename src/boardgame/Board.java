package boardgame;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private int rows;
	private int columns;
	
	private Piece[][] pieces;
	
	public Board() {
	}

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
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
	
	/*public Piece piece(int row, int columns) {
		return null;
	}
	
	public Piece piece(Position position) {
		return null;
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public Piece removePiece(Position position) {
		return null;
	}
	
	public boolean positionExists(Position position) {
		return false;
	}
	
	public boolean thereIsAPiece(Position position) {
		return false;
	}*/
	
}