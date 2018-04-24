package pl.wnukedwarda.cd_library;

public class TimeUtil {

    public static String intTimeToString(int seconds) {
        int hour = seconds / 3600;
        int minutes = seconds / 60;
        int second = seconds % 60;

        if (hour > 0) {
            return String.format("%02d:%02d:%02d", hour, minutes, second);
        } else {
            return String.format("%02d:%02d", minutes, second);
        }
    }
}
