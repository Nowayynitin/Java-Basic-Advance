import java.util.Scanner;

public class CtoF {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature Calculator");
        System.out.print("Please enter the temperature in Celcius : ");
        double temp = input.nextDouble();

        double F = (temp * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is  : " + F);
    }
}
