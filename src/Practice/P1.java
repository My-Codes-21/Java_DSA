package Practice;
import java.util.*;
public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n = sc.nextInt();
//        System.out.print("Enter the second number : ");
//        int n2 = sc.nextInt();
//
//        int div = n1/n2;
//        int mod = n1%n2;
//        System.out.println(div);
//        System.out.println(mod);
//
        int sp = 1;
        int st = n-1;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=st;j++){
               System.out.print("*\t");
           }
           for(int j=1;j<=sp;j++){
               System.out.print("\t");

           }
               sp--;
               st++;
           System.out.println();
       }

    }
}
