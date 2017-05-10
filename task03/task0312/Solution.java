package task03.task0312;

/**
 * Created by Руслан on 09.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));

    }
    public static int convertToSeconds(int hour) {
        int seconds = hour * 60 * 60;
        return seconds;

    }
}
