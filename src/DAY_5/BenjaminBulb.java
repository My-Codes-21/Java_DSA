package DAY_5;
import java.util.*;
public class BenjaminBulb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the BenjaminBulb number : ");
        int n = sc.nextInt();

            // just print i*i or square or root of these numbers
        // 20 bulbs togle at a time all are on
        // toggle 2nd time only 2 4 6 8 upto so on are toggle
        // same for all numbers like 3 6 9 and so on
        // then we have to print which bulb is on at the last

        for(int i =1;i*i<=n;i++){
            System.out.println("Bulb "+ i*i +" is on");
        }
    }
}
