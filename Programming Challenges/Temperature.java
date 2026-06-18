import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Converter");
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        double celcius = (temperature - 32) * 5/9;
        System.out.println("Celcius is: " + celcius + "degrees");
    }
}
