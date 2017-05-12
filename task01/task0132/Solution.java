package task01.task0132;

import sun.security.util.Length;

import java.lang.reflect.Array;

/**
 * Created by 1 on 12.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = String.valueOf(number);
        int m = 0;
        for (int i=0; i < s.length(); i++){
            m = Character.getNumericValue(s.charAt(i)) + m;
        }
        return m;

    }
}
