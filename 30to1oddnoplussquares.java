public class OddNumbersSum {
    public static void main(String[] args) {
        int sum = 0;

        //Chinmayee it's the column headers
        System.out.println("Odd Number\tSquare")
        for (int number = 30; number >= 1; number--) {
            if (number % 2 != 0) {
                sum += number; 
                int square = number * number;
                System.out.println(number + "\t\t" + square);
            }
        }

        System.out.println("Sum of all odd numbers from 30 to 1 is: " + sum);
    }
}
