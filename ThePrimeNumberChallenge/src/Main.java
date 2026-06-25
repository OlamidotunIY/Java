public class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "Not ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "Not ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "Not ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "Not ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "Not ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "Not ") + "a prime number");

        int counter = 0;
        for (int i = 700; i <= 1200; i++) {
            if (i <= 1000) {
                if (isPrime(i)) {
                    System.out.println(i + " is " + (isPrime(i) ? "" : "Not ") + "a prime number");
                    counter++;
                    if (counter == 3) {
                        System.out.println("Found 3 -  Existing the loop");
                        break;
                    }
                }
            }
        }

    }

    public static boolean isPrime(int wholenumber) {
        if (wholenumber <= 2) {
            return (wholenumber == 2);
        }

        for (int divisor = 2; divisor < wholenumber; divisor++) {
            if (wholenumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
