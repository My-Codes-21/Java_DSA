package DAY7;
import java.util.*;
public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();


            // same statement for i and j but printing values i==j else tabs
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                     System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}