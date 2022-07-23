package com.bridzelab.SnakeAndLadder;
import java.util.Random;  
public class SnakeNLadder 
{
	public static void main(String[] args)
	{
        int position = 0;
        int dieRolls = 0;
        Random rand = new Random();  
        while (position < 100)
        {
            int dice = rand.nextInt(6) + 1;
            dieRolls += 1;
            position += dice;   
            System.out.println(" The Player rools the die to get a number between 1 to 6 and the Die number is: "+dice);
        }
    }
}