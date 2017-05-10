package task01.task0131;

/**
 * Created by Руслан on 10.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int metr = centimetre / 100;
        return metr;
    }
}
