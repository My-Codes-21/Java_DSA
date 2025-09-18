package DAY6;
import java.util.*;
public class Pattern_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sp = 0;
        int st = n;

        for (int i=1;i<=n;i++){ //only for new line
            for (int j=1;j<=sp;j++){ // printing stars
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){ //printing stars
                System.out.print("*\t");

            }
            sp++; //increasing spaces
            st--; //decreasing decreasing stars
            System.out.println();
        }
    }
}
