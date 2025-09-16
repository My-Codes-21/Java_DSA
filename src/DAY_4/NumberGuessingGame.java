package DAY_4;
import java.util.Scanner;
public class NumberGuessingGame {

    public static void main(String[] args) {

            System.out.println("A Number Guessing Game ");
            System.out.println("Choose a Number From (1-100)");
            Scanner sc = new Scanner(System.in);
            // using math.random to multiply our number with 100
            int myNumber = (int)(Math.random()*100);
            int num;
            // do while loop for repeatedly asking
            do {
                System.out.print("Enter the number : ");
                num=sc.nextInt();

                // using 3 conditions

                if(myNumber == num){
                    System.out.println("You Won The Game!! ");
                    break;
                }
                else if (num > myNumber) {
                    System.out.println("The Number is too large");
                }
                else {
                    System.out.println("The Number is too short");

                }
            }while (num >=0);
            System.out.println("And the number is "+myNumber);
        }

    }




