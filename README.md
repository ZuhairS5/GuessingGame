# GuessingGame
Basic Java Guessing Game
//**********************************************************
// Author: Zuhair Shaikh
//
// Assignment: J5A5 Using the do While loop
//
// Description: Have your program randomly generate a target integer number between 1 and 100...etc.
//
// Date Start: 23/11/2018
// Date Completed: 29/11/2018
//
// Completion time: Too long to say...
//*********************************************************
   import java.util.*;

   public class GuessingGame {
   
      public static void main (String[] args) {
      
      Scanner input = new Scanner (System.in);
      
      int target;
      int totalGuesses = 0, guess;
      String response;
      
      do {
      
         target = (int)(Math.random() * 100 + 1); 
      
         do {

               System.out.print("Guess a number from 1-100: ");
               guess = Integer.parseInt(input.nextLine());
               
               totalGuesses++;

            if (guess < (target - 10)) {
               System.out.println("Too low!");
            }
            else if (guess >= (target - 10) && guess < target) {
               System.out.println("Low, but close!");
            }    
            else if (guess <= (target + 10) && guess > target) {
               System.out.println("High, but close!");
            }
            else if (guess > (target + 10)) {
               System.out.println("Too high!");
            }
            else {
               System.out.println("You win! It took you " + totalGuesses + " guesses to guess the number " + target + ".");
            }

         } while (guess != target);
         
         System.out.println("Want to play again? ");
         response = input.nextLine();
         
         if (response.equalsIgnoreCase("No")) {
            System.out.println("Hope you had fun!");
         }
         
         if (guess == target) {
            totalGuesses = -1;
            totalGuesses++;
         }

      } while(!response.equalsIgnoreCase("No"));
      
      }//end main method
   }//end class

//*********************************************************
/* Guess a number from 1-100: 97
   Too high!
   Guess a number from 1-100: 50
   Too low!
   Guess a number from 1-100: 60
   Low, but close!
   Guess a number from 1-100: 70
   High, but close!
   Guess a number from 1-100: 65
   Low, but close!
   Guess a number from 1-100: 67
   High, but close!
   Guess a number from 1-100: 66
   You win! It took you 7 guesses to guess the number 66.
   Want to play again? 
   Yes
   Guess a number from 1-100: 
*/
//*********************************************************
