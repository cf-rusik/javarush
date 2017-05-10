package task03.task0313;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Руслан on 09.05.2017.
 */
public class Solution {
    public static void main(String[] args) {
        String s1 = "Мама", s2 = "Мыла", s3 = "Раму";
        System.out.println(s1 + s2 + s3);
        System.out.println(s1 + s3 + s2);
        System.out.println(s2 + s1 + s3);
        System.out.println(s2 + s3 + s1);
        System.out.println(s3 + s1 + s2);
        System.out.println(s3 + s2 + s1);
    }
}
