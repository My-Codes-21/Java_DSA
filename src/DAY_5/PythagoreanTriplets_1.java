package DAY_5;
import java.util.*;
public class PythagoreanTriplets_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        System.out.print("Enter c value : ");
        int c = sc.nextInt();

        // checking greatest number

        int max = a;
        if(b >= max){
            max = b;
        }
        if (c >= max){
            max = c;
        }
        // pythagorean formula a * a + b * b = c * C


        if(max == a){
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        }else if(max ==b ){
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        }
        else{
            boolean flag = ((a * a + b * b ) == (c * c));
            System.out.println(flag);
        }

    }
}
