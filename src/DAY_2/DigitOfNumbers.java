package DAY_2;
import java.util.*;
public class DigitOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();

        int dig=0;
        int temp = num;
        while (temp!=0){
            temp=temp/10;
            dig++;
        }
        int div = (int)Math.pow(10, dig -1);
        while (div !=0){
            int q = num/div;
            System.out.println(q);

            num = num%div;
            div = div /10;
        }
    }
}
