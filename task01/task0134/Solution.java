package task01.task0134;

/**
 * Created by Руслан on 09.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //напишите тут ваш код
        long v = (a * b * c) * 1000;
        return v;

    }
}