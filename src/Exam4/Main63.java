package Exam4;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 10:02
 * @Description:
 */

public class Main63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = scanner.next();
        System.out.println(judgment(s));

    }

    public static String judgment(String s) {
        if (s == null || s.length() == 0 || s.length() > 6) {
            return "不满足";
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return "不满足";
            }
        }

        return "满足";

    }
}