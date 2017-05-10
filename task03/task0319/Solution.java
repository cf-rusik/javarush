package task03.task0319;

import java.io.*;


/**
 * Created by Руслан on 09.05.2017.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String strnum1 = reader.readLine();
        String strnum2 = reader.readLine();
        int num1 = Integer.parseInt(strnum1);
        int num2 = Integer.parseInt(strnum2);
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
