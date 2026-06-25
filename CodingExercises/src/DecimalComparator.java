public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        long roundedNumber1 = (long)(number1);
        long roundedNumber2 = (long)(number2);
        return roundedNumber1 == roundedNumber2;
    }
}
