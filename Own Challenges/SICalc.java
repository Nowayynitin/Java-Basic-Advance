import java.util.Scanner;

public class SICalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator");
        System.out.print("Please enter your interest rate : ");
        double rate = input.nextDouble();
        System.out.print("Please enter your principle amount : ");
        double amount = input.nextDouble();
        System.out.print("Please enter your duration in years : ");
        double time = input.nextDouble();

        double interest = (amount * rate * time)/100;
        System.out.println("Your interest is: " + interest);
    }
}

