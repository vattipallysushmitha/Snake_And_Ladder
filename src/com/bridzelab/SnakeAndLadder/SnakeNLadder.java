
package com.bridzelab.SnakeAndLadder;

public class SnakeNLadder {
	public static final int startPosition = 0;
	   public static final int winningPosition = 100;
		public static void main(String[] args) {
	      int dieRoll1, dieRoll2;
	      int dieRollCount1 = 0, dieRollCount2 = 0;
	      //int currentPosition = 0;
	      int playerPosition1 = 0;
	      int playerPosition2 = 0;
			//dieRoll = (int)(Math.random()*6) + 1;
	      //int option = (int)(Math.random()*3);

	      //System.out.println("The die comes up " + dieRoll);
	      while ((playerPosition1 < winningPosition) && (playerPosition2 < winningPosition))
	      {
	          dieRollCount1++;
	          System.out.println("Dice count is: " + dieRollCount1);
	          dieRoll1 = (int)(Math.random()*6) + 1;
	          System.out.println("The die comes up " + dieRoll1);
	          int option1 = (int)(Math.random()*3);
	          if(option1==0)
	          {
	             System.out.println("No Play");
	             playerPosition1 = playerPosition1;


	          }
	          else if(option1==1)
	          {
	             System.out.println("Got Ladder");
	             playerPosition1 += dieRoll1;
	             if(playerPosition1 > 100)
	             {
	                   playerPosition1 -= dieRoll1;
	             }

	          }
	          else if(option1==2)
	          {
	             System.out.println("Snake attacked");
	             playerPosition1 -= dieRoll1;
	             if(playerPosition1 < 0)
	             {
	                   playerPosition1 = 0;
	             }

	          }
	          System.out.println("New Player1 position is: " + playerPosition1);

	          //player2
	          dieRollCount2++;
	          System.out.println("Dice count is: " + dieRollCount2);
	          dieRoll2 = (int)(Math.random()*6) + 1;
	          System.out.println("The die comes up " + dieRoll2);
	          int option2 = (int)(Math.random()*3);
	          if(option2==0)
	          {
	             System.out.println("No Play");
	             playerPosition2 = playerPosition2;


	          }
	          else if(option2==1)
	          {
	             System.out.println("Got Ladder");
	             playerPosition2 += dieRoll2;
	             if(playerPosition2 > 100)
	             {
	                   playerPosition2 -= dieRoll2;
	             }

	          }
	          else if(option2==2)
	          {
	             System.out.println("Snake attacked");
	             playerPosition2 -= dieRoll2;
	             if(playerPosition2 < 0)
	             {
	                   playerPosition2 = 0;
	             }

	          }
	          System.out.println("New Player2 position is: " + playerPosition2);
	      }
	      if(playerPosition1  == winningPosition)
	      {
	          System.out.println("Hurray!... Player1 has reached to Winning Position in " + dieRollCount1 + " steps");
	      }
	      else
	      {
	          System.out.println("Huuray!... Player2 has reached to winning Position in " + dieRollCount2 + " steps");
	      }

		}
	}