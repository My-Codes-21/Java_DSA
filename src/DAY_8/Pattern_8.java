package DAY_8;
import java.util.*;
public class Pattern_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1){  // first we are printing whole square then the diagonal
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}



