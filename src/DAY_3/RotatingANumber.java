package DAY_3;
import java.util.*;
public class RotatingANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1= sc.nextInt();
        System.out.print("Enter the rotations : ");
        int num2= sc.nextInt();

        int temp = num1;
        int nod = 0;
        while(temp > 0){
            temp = temp / 10;
            nod++;

        }
        num2 = num2 % nod;
        if (num2 < 0){
            num2 = num2 + nod;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i<=nod;i++){
            if(i <= num2){
                div = div * 10;
            }else {
                mult = mult * 10;
            }
        }
        int q = num1 / div;
        int r = num1 % div;

        int rot = r * mult + q;
        System.out.println(rot);
    }

}
