package task03.task0304;

/**
 * Created by Руслан on 08.05.2017.
 */
public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double ten = i + (i*0.1);
        return ten;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
