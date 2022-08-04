package lesson15.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 18:18
 * @Description:
 */

public class Main4 {
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        String s1 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s2 = "";
        System.out.println(getVCode(s1, s2));
    }

    public static String getVCode(String s1, String s2) {
        if (s2.length() == 6) {
            return s2;
        }
        int v = (int) (Math.random() * s1.length());
        char c = s1.charAt(v);
        if (s2.indexOf(c) == -1) {
            s2 += s1.charAt(v);
        }

        return getVCode(s1, s2);
    }
}