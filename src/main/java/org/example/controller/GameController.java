package org.example.controller;

import org.example.exception.InvalidGameConstructionParametersException;
import org.example.models.Game;
import org.example.models.GameStatus;
import org.example.models.Player;

import java.util.List;

public class GameController {
    public void undo(Game game){
        game.undo();
    }

    public Game createGame(int dimension, List<Player> players){
        try{
            return Game.getBuilder()
                    .setDimension(dimension)
                    .setPlayers(players)
                    .build();
        } catch (InvalidGameConstructionParametersException e) {
            return null;
        }
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }

    public void executeNextMove(Game game) {
        game.makeNextMove();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }
}
