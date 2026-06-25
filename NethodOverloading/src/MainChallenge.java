public class MainChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(8, 5) + "cm");
        System.out.println("68in = " + convertToCentimeters(68, 0) + "cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        double inch = 2.54;
        return heightInInches * inch;
    }

    public static double convertToCentimeters(int heightInInches, int heightInFoot) {
        int foot = 12;
        return convertToCentimeters((heightInInches + (heightInFoot * foot)));
    }
}
