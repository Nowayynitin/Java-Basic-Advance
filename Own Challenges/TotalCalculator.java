import java.util.Scanner;

public class TotalCalculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Total Marks Calculator");
        System.out.print("Enter the Marks of the First Subject : ");
        double firstSubject = input.nextDouble();
        System.out.print("Enter the Marks of the Second Subject : ");
        double secondSubject = input.nextDouble();
        System.out.print("Enter the Marks of the Third Subject : ");
        double thirdSubject = input.nextDouble();
        System.out.print("Enter the Marks of the Fourth Subject : ");
        double fourthSubject = input.nextDouble();
        System.out.print("Enter the Marks of the Fifth Subject : ");
        double fifthSubject = input.nextDouble();
        double total =  firstSubject+secondSubject+thirdSubject+fourthSubject+fifthSubject;
        System.out.println("The total marks are  : " + total);

        double percent = (total*100)/500;
        System.out.println("The percent scored are  : " + percent);


    }
}
