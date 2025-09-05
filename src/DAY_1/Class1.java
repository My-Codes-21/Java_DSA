package DAY_1;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //printing z using \n
        System.out.println("*****\n   *\n  *\n *\n*\n*****");
        int a=15;
        int b = 20;
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

        if(a ==b ){
            System.out.println("a is equal to b");

        }
        else {
            if (a > b){
                System.out.println("a is greater than b");

            }
            else {
                System.out.println("a is smaller than b");
            }
        }
//         marks condition checker
        int marks=sc.nextInt();
        if (marks > 90){
            System.out.println("Excellent");
        }
        else if (marks >80 && marks <= 90){
            System.out.println("Good");

        }else {
            if (marks >70 && marks <=80){
                System.out.println("Fair");
            }
            else if (marks >= 60 && marks <=70){
                System.out.println("Meets Expectation");

            }
            else {
                System.out.println("below par");
            }
        }
    }
}
