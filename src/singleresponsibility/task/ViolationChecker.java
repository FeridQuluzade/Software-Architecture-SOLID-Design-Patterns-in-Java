package SingleResponsibility.task;

import java.util.List;

public class ViolationChecker {

    public static boolean isValid(String num) {
        try {
            Integer.parseInt(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isValidRange(Integer num) {
        return num >= 0 && num <= 10;
    }

}
