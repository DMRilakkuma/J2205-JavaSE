package lesson15.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 17:58
 * @Description:
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("请输入8个字符的字符串:");
            s = scanner.next();
            if (s.length() == 8) {
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                s = s.replace(s.charAt(i), 'M');
            }
        }
        System.out.println(s);

    }
}