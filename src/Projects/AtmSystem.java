package Projects;
import java.util.*;
public class AtmSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int balance = 12000;
        System.out.println("Welcome to Yes Bank ");
        System.out.print("Enter the  ATM Pin : ");
        int pin = sc.nextInt();

            if (pin==4567){
                System.out.println("1.Withdraw amount");
                System.out.println("2.Check balance");
                System.out.println("3.Deposit amount");
                System.out.println("4.Change pin");
                System.out.println("5.Exit");
                System.out.print("Enter Your Choice : ");

                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        if(choice==1){
                            System.out.print("Enter the amount you want to withdraw : ");
                            int withdraw=sc.nextInt();
                            int amount = balance - withdraw;
                            System.out.println("Amount deducted "+withdraw);
                            System.out.println("Your Available balance is : "+amount);
                            System.out.println("Do you want to print recept ? :");
                            String type = sc.nextLine();
                            if (type=="yes"){
                                System.out.println("Your recept ");

                            }else {
                                break;
                            }
                        }
                }
            }
            else {
                System.out.println("Invalid Pin Enter the correct Pin");
            }

    }
}










/*
package Game;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        String choice;

        System.out.println("A Number Guessing Game!");
        System.out.println("Guess the number from 1 to 100");

        do {
            int myNumber = (int)(Math.random() * 100);
            int num;

            while (true) {
                System.out.print("Enter your guess: ");
                // Check if input is an integer
                if (!take.hasNextInt()) {
                    System.out.println("Please enter a valid number.");
                    take.next(); // discard invalid input
                    continue;
                }

                num = take.nextInt();

                if (num == myNumber) {
                    System.out.println("🎉 You won the game!");
                    break;
                } else if (num > myNumber) {
                    System.out.println("📉 Too high! Try again.");
                } else {
                    System.out.println("📈 Too low! Try again.");
                }
            }

            // Ask user if they want to play again
            take.nextLine(); // consume leftover newline
            System.out.print("Do you want to play again? (yes/no): ");
            choice = take.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("👋 Thanks for playing! Game over.");
        take.close();
    }
}*/