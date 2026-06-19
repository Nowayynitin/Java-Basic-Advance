import java.util.Scanner;

public class DayToYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the day to years calculator : ");
        System.out.println("Please enter the number of days you want to calculate : ");
        int day = input.nextInt();

        int years = day / 365;
        int remaining_days = day % 365;
        int months = remaining_days / 30;
        int days = remaining_days % 30;

        System.out.println("The Calculated years are  : " + years + " Years and " + months + " Months and " + days + " Days ");
    }

}
