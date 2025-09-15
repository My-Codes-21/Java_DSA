package DAY_3;
import java.util.*;
public class InverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int inv = 0;
        int op = 1;
        while(num != 0){
            int od = num % 10;
            int id = op;
            int ip = od;

            inv = inv + id * (int)Math.pow(10, ip - 1);
            num = num / 10;
            op++;
        }
        System.out.println(inv);
    }
}
