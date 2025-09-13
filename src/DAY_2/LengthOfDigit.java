package DAY_2;
import java.util.*;
public class LengthOfDigit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int dig= 0;
        while (num!=0){
            num=num/10;
            dig++;
        }
        System.out.println(dig);
    }
}
