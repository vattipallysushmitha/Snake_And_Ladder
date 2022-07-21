/* Q-2) The Player rolls the die
        to get a number
        between 1 to 6. - Use ((RANDOM)) to get the number between
        1 to 6
*/

package com.bridzelab.SnakeAndLadder;
import java.util.Random;  // import random
public class SnakeNLadder {
	public static void main(String[] args) {
        int position = 0;
        int dieRolls = 0;
        Random rand = new Random();  //Random object initializer
	
        while (position < 100) {
            int dice = rand.nextInt(6) + 1;
            dieRolls += 1;
            position += dice;   //Actual position
            System.out.println("Die number is: "+dice);
        }
    }
}