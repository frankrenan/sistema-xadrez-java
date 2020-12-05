package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece { /* Classe Rei */

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

}
