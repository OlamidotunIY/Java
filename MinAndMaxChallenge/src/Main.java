import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number;
        double minNumber = 0;
        double maxNumber = 0;
        boolean isValidNumber = false;
        int loopCount = 0;

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);


        do {
            try {
                number = Double.parseDouble(input.nextLine());
                if (loopCount == 0 || number < minNumber) {
                    minNumber = number;
                }
                if (loopCount == 0 || number > maxNumber) {
                    maxNumber = number;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                isValidNumber = true;
            }
        } while (!isValidNumber);

        if (loopCount > 0) {
            System.out.println("min = " + minNumber + ", max = " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
