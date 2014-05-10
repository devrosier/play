package org.irosier.myswing;

public class GridLocation {
	
	private GamePiece piece = null;
	
	public boolean isEmpty() {
		return piece == null;
	}

	public GamePiece getPiece() {
		return piece;
	}

	public void setPiece(GamePiece piece) {
		this.piece = piece;
	}

}
