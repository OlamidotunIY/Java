import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateSumOfFiveNumbers());
    }

    public static String calculateSumOfFiveNumbers() {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int count = 1;

        do {
            System.out.println("Enter number #" + count + ": ");
            double number = checkValidNumber(input.nextLine());

            if (number >= 1) {
                count++;
                sum += number;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        } while ((count <= 5));

        return "The sum of your 5 numbers is " + sum;
    }

    public static double checkValidNumber(String number) {
        try {
            double numberDouble = Double.parseDouble(number);
            if (numberDouble < 0) {
                return -1;
            }
            return numberDouble;
        } catch (NumberFormatException badNumber) {
            return -1;
        }
    }
}
