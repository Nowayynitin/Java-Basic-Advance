import java.util.Scanner;

public class Perimeter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Finder of Rectangles");
        System.out.println("Enter the Length of the Rectangle in cm : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Width of the Rectangle in cm : ");
        double w = sc.nextDouble();

        double perimeter = l+l+w+w;
        System.out.println("The Perimeter of the Rectangle is : "+perimeter + "cm");

    }
}
