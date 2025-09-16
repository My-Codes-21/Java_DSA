package DAY_4;
import java.util.*;
public class PrimeFactorization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prime Factor number : ");
        int n = sc.nextInt();

        for (int div = 2; div * div <= n;div++ ){
            while (n % div == 0){ // 1440%2 gives rem as 0
                n = n / div; // 1440/2 gives 720
                System.out.println(div); // 2 is the first div
            }
        }
        if(n!= 0){ // 5!=0
            System.out.println(n); //like 46 which have only 2 and 23
        }
    }
}
