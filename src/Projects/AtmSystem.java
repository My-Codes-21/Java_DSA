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
                            System.out.println("Enter the amount you want to withdraw : ");
                            int withdraw=sc.nextInt();
                            int amount = balance - withdraw;
                            System.out.println("Your Available balance is : "+amount);
                        }
                }
            }
            else {
                System.out.println("Invalid Pin Enter the correct Pin");
            }

    }
}
