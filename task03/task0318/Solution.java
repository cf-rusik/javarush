package task03.task0318;

/**
 * Created by Руслан on 09.05.2017.
 */
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String age = reader.readLine();
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + Integer.parseInt(age) +" лет. Му-ха-ха!");

    }
}