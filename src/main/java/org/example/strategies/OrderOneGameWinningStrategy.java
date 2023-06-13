package org.example.strategies;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    private int boardDimensions;

    public OrderOneGameWinningStrategy(int boardDimensions) {
        this.boardDimensions = boardDimensions;
    }

    @Override
    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell) {
        //TODO: implement this
        return false;
    }
}
