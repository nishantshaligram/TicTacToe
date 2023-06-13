package org.example.strategies.botPlayingStrategy;

import org.example.models.Board;
import org.example.models.Move;
import org.example.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
