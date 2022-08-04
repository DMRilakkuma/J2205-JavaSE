package lesson10.homework2;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 17:27
 * @Description:
 */

public class CharacterSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字符串:");
            String s = scanner.next();
            if ("end".equals(s)) {
                System.out.println("判断结束");
                break;
            }
            char[] chars = s.toCharArray();
//            for (int i = 0; i < s.length(); i++) {
//                if (chars[i] >= 'a' && chars[i] <= 'z') {
//                    chars[i] = Character.toUpperCase(chars[i]);
//                } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
//                    chars[i] = Character.toLowerCase(chars[i]);
//                }else{
//
//                    chars[i] = '*';
//                }
//            }

            for (int i = 0; i < chars.length; i++) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else {
                    chars[i] = '*';
                }
            }
            s = String.valueOf(chars);
            System.out.println(s);
        }
    }
}