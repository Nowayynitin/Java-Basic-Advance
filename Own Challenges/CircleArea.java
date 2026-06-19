import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Circle Area Calculator");
        System.out.print("Enter the radius of the circle in cm : ");
        double radius = input.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("The area of the circle is: " + area + "cm^2");
    }
}
