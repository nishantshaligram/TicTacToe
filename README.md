# Gather Requirements:
___
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
# Use-Case Diagram
___

# Class Diagram
___
 ![TicTacToe Class Diagram](/class-diagram.drawio.png?raw=true "TicTacToe Class Diagram")