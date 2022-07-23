


package com.bridzelab.SnakeAndLadder;
public class SnakeNLadder


{
	public static final int startPosition = 0;
	   public static final int winningPosition = 100;
		public static void main(String[] args) 
		
		{
	      int dieRoll;
	      int dieRollCount = 0;


	      int playerPosition = 0;
			
	      
	      
	      
	      while (playerPosition < winningPosition)
	      {
	    	  
	    	  
	          dieRollCount++;
	          System.out.println("Dice count is: " + dieRollCount);
	          dieRoll = (int)(Math.random()*6) + 1;
	          System.out.println("The die comes up " + dieRoll);
	          int option = (int)(Math.random()*3);
	          if(option==0)
	          {
	        	  
	        	  
	             System.out.println("No Play");
	             playerPosition = playerPosition;


	          }
	          
	          
	          else if(option==1)
	          {
	        	  
	        	  
	             System.out.println("Got Ladder");
	             playerPosition += dieRoll;
	             if(playerPosition > 100)
	             {
	            	 
	            	 
	                   playerPosition -= dieRoll;
	             }
	             

	          }
	          
	          
	          else if(option==2)
	          {
	        	  
	        	  
	             System.out.println("Snake attacked");
	             playerPosition -= dieRoll;
	             if(playerPosition < 0)
	             {
	                
	            	 
	            	 playerPosition = 0;
	             }

	          }
	          
	          
	          System.out.println("New Player position is: " + playerPosition);
	          if(playerPosition == 100)
	          {
	        	  
	        	  
	             System.out.println("reached to Winning Position");
	          }
	      }
		}
	}