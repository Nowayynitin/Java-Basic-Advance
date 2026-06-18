import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Triangle Area Finder");
        System.out.print("Please enter the value of Base in cm : ");
        double base = input.nextDouble();
        System.out.print("Please enter the value of Height in cm : ");
        double height = input.nextDouble();

        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area + "cm^2");

    }
}
