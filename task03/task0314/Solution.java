package task03.task0314;

/**
 * Created by Руслан on 09.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        int x = 1, y = 1;
        while (x <= 10){
            while (y <= 10){
                System.out.print(x * y + " ");
                y ++;
            }
            System.out.println();
            y = 1;
            x ++;
        }
    }
}
