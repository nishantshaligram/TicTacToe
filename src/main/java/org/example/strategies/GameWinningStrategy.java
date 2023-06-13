package org.example.strategies;

import org.example.models.Board;
import org.example.models.Cell;
import org.example.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell);
}
