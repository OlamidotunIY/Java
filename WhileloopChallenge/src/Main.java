public class Main {
    public static void main(String[] args) {
        int j = 4;
        int evenCount = 0;
        int oddCount = 0;
        while (j <= 20) {
            j++;
            if (!isEvenNumber(j)) {
                oddCount++;
                continue;
            }
            evenCount++;
            System.out.println(j + " is an even number");
            if ((evenCount >= 5)) {
                break;
            }
        }

        System.out.println("Odd numbers count is " + oddCount + " and even number count is " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
