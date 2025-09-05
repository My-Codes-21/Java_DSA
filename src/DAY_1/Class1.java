package DAY_1;

import java.security.spec.RSAOtherPrimeInfo;

public class Class1 {
    public static void main(String[] args){
        //printing z using \n
        System.out.println("*****\n   *\n  *\n *\n*\n*****");
        int a=20;
        int b = 15;
        int sum = a+b;
        int pro =a*b;
        int sub =a-b;
        int divi =a/b;
        int mod = a%b;
        int exp = (a*b)/(a+b);
        System.out.println(sub);
        System.out.println(sum);
        System.out.println(pro);
        System.out.println(divi);
        System.out.println(exp);
        System.out.println(mod);

        if(a % 2 ==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        System.out.println("Condition exited");
    }
}
