package DAY_5;
import java.util.*;

public class Pattern_2 {
    public static void main(String[] args){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--){    // this loop is just increasing the value

            for(int j = 1; j <= i; j++){   //this loop is printing the stars in sameline

                System.out.print(" * ");

            }
            System.out.println(""); // this is only for new line

        }
    }
}


// Eg by taking input as 5
//        *  *  *  *  *
//        *  *  *  *
//        *  *  *
//        *  *
//        *