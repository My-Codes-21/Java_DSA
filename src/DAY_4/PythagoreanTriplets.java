package DAY_4;
import java.util.*;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter value of a : ");
            int a = sc.nextInt();
            System.out.print("Enter value of b : ");
            int b = sc.nextInt();
            System.out.print("Enter value of c : ");
            int c = sc.nextInt();

            // finding max and min value form a b and c

            int max, min;
            if (a > b && a > c) {
                max = a;
            } else if (b > c) {
                max = b;
            } else {
                max = c;
            }
            // checking which is lesser value

            if (a < b && a < c) {
                min = a;
            } else if (b < c) {
                min = b;
            } else {
                min = c;
            }

            // checking length of all values

            int len;
            if (a < max && a > min) {
                len = a;
            } else if (b < max && b > min) {
                len = b;
            } else {
                len = c;
            }

            int hypo = max;
            int breadth = min;
            System.out.println("Hypo: " + hypo);
            System.out.println("Breadth : " + breadth);
            System.out.println("Length : " + len);

            if ((hypo * hypo) == (breadth * breadth) + (len * len)) {
                System.out.println("Right Angle Triangle");
            } else {
                System.out.println("Not a Right Angle Triangle");
            }
        }
    }

}