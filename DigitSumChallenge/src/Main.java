public class Main {
    public static void main(String[] args) {
       int sum = sumDigits(-348);
       System.out.println(sum + " is the sum of digit for the number 1000");
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        sum += number;
        return sum;
    }
}
