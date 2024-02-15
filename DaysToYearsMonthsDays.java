import java.util.Scanner;

public class DaysToYearsMonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Constants for conversion
        final int DAYS_PER_YEAR = 365;
        final int DAYS_PER_MONTH = 30;
        
        // Prompt the user to enter the number of days
        System.out.println("Enter the number of days:");
        int totalDays = scanner.nextInt();
        
        // Calculate years
        int years = totalDays / DAYS_PER_YEAR;
        int remainingDays = totalDays % DAYS_PER_YEAR;
        
        // Calculate months
        int months = remainingDays / DAYS_PER_MONTH;
        remainingDays %= DAYS_PER_MONTH;
        
        // Output the result
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Remaining Days: " + remainingDays);
        
        scanner.close();
    }
}
