package org.example.strategies;

import org.example.models.Move;
import org.example.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player);
}
