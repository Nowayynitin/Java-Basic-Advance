import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator");
        System.out.print("Enter the number of years you want to calculate for Compound: ");
        double years = input.nextDouble();
        System.out.print("Enter the rate of Interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter the amount to calculate for Compound: ");
        double amount = input.nextDouble();

        double interest = amount * Math.pow((1+ rate / 100),years);
        System.out.println("Your interest is: " + interest);

    }
}
