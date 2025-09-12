package DAY_1;
import java.util.Scanner;
public class ForLoop1 {
    public static void main(String[] args) {
        System.out.println("Using for loop");
        for(int i =1;i<=9; i++){
            System.out.println(i);}


        // taking input and showing out put
        // taking integer as inpput
        // first import Scanner
        // create object of Scanner
        // to take both integer and string in same code
        // we convert the string to integer using Integer.parseInt(sc.nextLine())
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int  num= Integer.parseInt(sc.nextLine());
        System.out.println(num);
        System.out.print("Enter the string : ");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println("printing your number");
        for(int j =1; j<=num;j++){
            System.out.println(j);
        }
        // checking prime or not
        int num1 = Integer.parseInt(sc.nextLine());
        int k = 0;
        while (true){
            if ( k %num==0){
                System.out.println("The number is prime");
            }
            else {
                System.out.println("not prime");
            }

        }
    }
}
