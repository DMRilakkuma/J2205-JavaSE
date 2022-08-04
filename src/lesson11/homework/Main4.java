package lesson11.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 18:06
 * @Description:
 */

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() < 8 || s.length() > 12) {
            System.out.println("不合法");
            return;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                System.out.println("不合法");
                return;
            }
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("不合法");
            return;
        }
        System.out.println("合法");
    }
}