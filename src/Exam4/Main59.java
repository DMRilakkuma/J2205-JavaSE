package Exam4;


import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 09:55
 * @Description:
 */

public class Main59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你需要计数的字符串:");
        String s = scanner.next();
        int lowerCaseLetter = 0;
        int uppercaseLetter = 0;
        int digital = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digital++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lowerCaseLetter++;
            } else if (Character.isUpperCase(s.charAt(i))) {
                uppercaseLetter++;
            }
        }
        System.out.println("小写字母有: " + lowerCaseLetter);
        System.out.println("大写字母有:" + uppercaseLetter);
        System.out.println("数字有: " + digital);
    }
}