import java.util.Scanner;

public class input20nosandfindlargestno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int largest = scanner.nextInt(); // Initialize largest with the first number

        System.out.println("Enter 19 more numbers:");

        for (int i = 0; i < 19; i++) {
            int number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
