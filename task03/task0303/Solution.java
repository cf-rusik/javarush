package task03.task0303;

/**
 * Created by Руслан on 08.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 0.7));
        System.out.println(convertEurToUsd(10, 0.8));
    }

    public static double convertEurToUsd(int eur, double course){
        double dollar = eur * course;
        return dollar;
    }
}
