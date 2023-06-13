# Gather Requirements:
1. Size of the board = NxN.
2. No. of Players = N-1. all players will have unique symbol.
3. Minimum no. of Players = 2.
4. At the beginning randomize the player list and move in that order. For example, 
If player list is A, B, C, D -> Randomized -> B, D, C, A. 
Now the turn of player will be in the same order.
5. If any player achieves it's related symbol across the whole row or column or
diagonal it means that player has won the game.
6. Game ends when we have winner or draw.
7. All cells filled and no winner is there, it means the game is draw.
8. Will the game have bots = Yes. (Bot is also player).
9. Will bots have difficulty level = Yes.
10. Timer between moves = No.
11. Tournaments, Pause, Resume, Forfeit, Leaderboard = No.
12. Allow people to undo the moves = Yes.
13. Blocked cells in the board = Yes.
14. Re-watch of game should be available = Yes.
___
# Class Diagram
 ![TicTacToe Class Diagram](/class-diagram.drawio.png?raw=true "TicTacToe Class Diagram")
___
## How to implement the "Undo" operations in our game?
### Option 1: 
- Remove the move from the List of Moves.
- Update the board as per the move that we've removed.
### Option 2:
- Remove the last move.
- Redo all the previous move.
- Get the new current state of board.
### Option 3 (Doreamon Time Machine):
- With every move players play maintain of the state of the board.
- So we will maintain list of moves as well as list of board state.
- When an undo operation is done remove the last move along with the last state of board.
___
## Algorithm to choose the winning player
- Column has same sign
- Row has same sign
- Diagonal has same sign
