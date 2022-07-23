package com.bridzelab.SnakeAndLadder;
public class SnakeNLadder 
{
	 public static final int startPosition = 0;
		public static void main(String[] args) 
		{
	      int dieRoll;
	      int currentPosition = 0;
	      int playerPosition = startPosition;
			dieRoll = (int)(Math.random()*6) + 1;
	      

	      System.out.println("The die comes up " + dieRoll);
	     
	      int option = (int)(Math.random()*3);
	      if(option==0)
	      {
	          System.out.println("No Play");
	          currentPosition = startPosition;

	      }
	      else if(option==1)
	      {
	          System.out.println("Got Ladder");
	          currentPosition += dieRoll;
	      }
	      else if(option==2)
	      {
	          System.out.println("Snake attacked");
	          currentPosition -= dieRoll;
	      }
	      System.out.println("New Player position is: " + currentPosition);
		}
	}