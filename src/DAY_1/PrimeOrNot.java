package DAY_1;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("To check the number is prime or not ");
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
//        int i=1;
//        do {
//            if (num % i == 0 || num %num==0){
//                System.out.println("the number is prime number");
//            }
//            else {
//                System.out.println("The number is not prime");
//            }
//        }while (num<=0);
//            System.out.println("Program is executed");

            int count = 0;
            for (int div = 1; div <= num; div++) {
                if (num % div == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

        }

    }
}

//
//package DAY_1;
//import java.util.Scanner;
//
//public class PrimeOrNot {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num;
//
//        do {
//            System.out.println("To check the number is prime or not ");
//            System.out.println("Enter the number (or -1 to exit): ");
//            num = sc.nextInt();
//
//            if (num == -1) {
//                // Sentinel value detected — stop loop
//                break;
//            }
//
//            int i = 2;
//            do {
//                if (num % i == 0 || num % num == 0) {
//                    System.out.println("the number is prime number");
//                } else {
//                    System.out.println("The number is not prime");
//                }
//                // Without a change to i, this inner loop runs once, which matches your original intent
//            } while (num <= 0);
//
//            System.out.println("Program is executed");
//
//        } while (true);  // Infinite outer loop until sentinel triggers "break"
//
//        sc.close();
//        System.out.println("Exited as user entered -1.");
//    }
//}


