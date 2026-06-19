import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sum Calculator");
        System.out.print("Please enter the First number you would like to sum : ");
        int num1 = input.nextInt();
        System.out.print("Please enter the Second number you would like to sum : ");
        int num2 = input.nextInt();

        int c =  num1 + num2;
        System.out.println("The sum is: " + c);


    }
}
