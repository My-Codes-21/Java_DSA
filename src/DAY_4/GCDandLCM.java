package DAY_4;
import java.util.*;
public class GCDandLCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();

        int on1 = n1;
        int on2 = n2;

        while (n1 % n2 != 0){ // mod is used to get rem not the last 0 value
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
            //at last we get rem as n2 so it is gcd
        }
        int gcd = n2;
        int lcm = (on1 * on2)/gcd;//for finding lcm multi org values and div by gcd to get lcm
        System.out.println(gcd+" Is the GCD");
        System.out.println(lcm+ " IS the LCM");
    }
}
