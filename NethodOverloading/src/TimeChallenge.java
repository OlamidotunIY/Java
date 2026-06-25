public class TimeChallenge {
    public static void main(String[] args) {

        System.out.println(getDuration(3945));
        System.out.println(getDuration(65, 45));
    }

    public static String getDuration(int seconds) {
        if (seconds >= 0) {
            return getDuration(seconds / 60, seconds % 60);
        } else {
            return "Invalid value";
        }
    }

    public static String getDuration(int minutes, int seconds) {
        if (seconds >= 0 && seconds <= 59 && minutes >= 0) {
            return String.format("%02d:%02d:%02d", minutes / 60, minutes % 60, seconds);
        } else {
            return "Invalid value";
        }
    }
}
