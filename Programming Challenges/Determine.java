import java.sql.SQLOutput;
import java.util.Scanner;

public class Determine {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Determiner");
        System.out.println("Enter Your Number : ");
        int n=sc.nextInt();

        if (n>0) {
            System.out.println("Your Number is Positive");
        } else if (n<0) {
            System.out.println("Your Number is Negative");
        }  else if (n==0) {
            System.out.println("Your Number is Zero");
        }
    }
}
