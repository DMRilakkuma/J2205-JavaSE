package Exam3.exer38;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 09:57
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = encryption(s);
        System.out.println(s);
        s = decrypt(s);
        System.out.println(s);
    }


    // 加密字符串
    public static String encryption(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + 5);
        }

        return String.valueOf(chars);
    }


    // 解密字符
    public static String decrypt(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - 5);
        }

        return String.valueOf(chars);
    }
}