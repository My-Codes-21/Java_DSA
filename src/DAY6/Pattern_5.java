package DAY6;
import java.util.*;
public class Pattern_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sp = n/2; // value is changing after n/2 times
        int st = 1;

        for (int i =1;i<=n;i++){
//            System.out.println(sp+","+st);
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            // if <= 2 condition increasing or decreasing stars and spaces
            if (i<=2){
                sp--;
                st+=2;
            }
            else {
                sp++;
                st-=2;
            }
            System.out.println();
        }

    }
}
