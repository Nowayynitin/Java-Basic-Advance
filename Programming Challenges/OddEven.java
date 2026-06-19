import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Program");
        System.out.print("Enter a Number : ");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println("Your Number is Even");
        } else
            System.out.println("Your Number is Odd");
    }
}
