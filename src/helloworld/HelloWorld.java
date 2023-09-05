
package helloworld;

import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("\n\t\t\tROCK | PAPER | SCISSORS");
            System.out.println("\tWhat you choose?");
            String playerInput = scanner.nextLine();
            playerInput = playerInput.toLowerCase();

            int playerChoice = 0;

            switch (playerInput) {
                case "rock":
                    playerChoice = 1;
                    break;
                case "paper":
                    playerChoice = 2;
                    break;
                case "scissors":
                    playerChoice = 3;
                    break;
                default:
                    System.out.println("There is no such choice!");
                    continue;
            }

            int computerChoice = rand.nextInt(3) + 1;

            String computerInput;

            switch (computerChoice) {
                case 1:
                    computerInput = "rock";
                    break;
                case 2:
                    computerInput = "paper";
                    break;
                case 3:
                    computerInput = "scissors";
                    break;
                default:
                    computerInput = "";
                    break;
            }

            System.out.println("\nYour choice -> " + playerInput.toUpperCase() + "\n" + "Computer choice -> " + computerInput.toUpperCase());

            if (playerChoice == computerChoice) {
                System.out.println("\nTie");
            } else if ((playerChoice == 1 && computerChoice == 2) || 
                       (playerChoice == 1 && computerChoice == 3) ||
                       (playerChoice == 2 && computerChoice == 3) || 
                       (playerChoice == 3 && computerChoice == 1)) {
                System.out.println("\nComputer won");
            } else {
                System.out.println("\nPlayer won");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break; 
                
            }
        }
        System.out.println("Thanks for playing! Goodbye!");
    }
}
