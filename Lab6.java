
/*
Implement a Connect 4 game. 

The program should allow two players to play each other. 

For each turn, have the user enter the column they want to play in, 
validate the user has made a good move, 
and then place the piece on the board. 

Then the program should check for a winner and a tie, 
and assuming there is neither, redisplay the board and get the next players move.

Display the moves using print/println commands, 
and use an X for player 1 and an O for player 2. 

When the game ends, the program should display congratulations to the winner or 
announce there was a tie, 
and then allow the players to choose to play again or exit.

You must use a 2D array for this lab.

*/

import java.util.Scanner;

public class Lab6{
	public static void main(String[] args){


		//create 2d array for game board : 6 rows 7 columns
		//fill game board with * representing empty holes
		//fill with "X" for user1 and "O" for user2
		String[][] gameBoard = new String[6][7];

		for(int i = 0; i < gameBoard.length; i++){
			for(int j = 0; j < gameBoard[i].length; j++){
				gameBoard[i][j] = "*";
				System.out.print(gameBoard[i][j] + " ");
			}
			System.out.println("");
		}
		
		

		/*
		get user input for column from user
		validate column choice
			within user selected column, if row - 1 is not filled, 
			make that the user filled column
			use a for loop or while loop to check if rows below are filled

		*/

			



	}
}