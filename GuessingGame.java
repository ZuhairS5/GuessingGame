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
