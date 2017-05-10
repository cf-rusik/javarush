package task01.task0133;

/**
 * Created by Руслан on 09.05.2017.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }
    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int sec = seconds;
        while (sec >= 3600) {
            sec = sec - 3600;
        }
        return sec;
    }
}
