package DAY_3;
import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        while(num>0){
            int dig = num % 10;
            num = num / 10;
            System.out.println(dig);
        }

    }
}
