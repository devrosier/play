package org.irosier.myswing;

public class GamePiece {
	
	public static enum Type {HEAD, BODY, TAIL};
	public Type type;
	
	public GamePiece(Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public boolean isHead() {
		return type == Type.HEAD;
	}
	public boolean isBody() {
		return type == Type.BODY;
	}
	public boolean isTail() {
		return type == Type.TAIL;
	}
}
