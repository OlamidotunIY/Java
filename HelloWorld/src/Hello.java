public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien");
            System.out.println("And i am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition should be true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("You got the high score!");
        };

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not suppose to happen");
        }

        String makeOfCar = "Volswagen";
        boolean isDomestic = makeOfCar == "Volswagen" ? false : true;

        if (isDomestic) {
            System.out.println("It is a domestic car");
        }

        String s = (isDomestic) ? "This car is domenstic" : "This car is not domestic";

        System.out.println(s);

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        Double remainder = ((firstValue + secondValue) * 100.00d) % 40.00d;
        System.out.println(remainder);
        boolean isRemainderZero = remainder == 0;
        System.out.println(isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("got some remainder");
        }
    }
}
