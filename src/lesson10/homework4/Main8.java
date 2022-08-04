package lesson10.homework4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 18:54
 * @Description:
 */

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        // 可以用冒泡
        s = String.valueOf(chars);
        System.out.println(s);
    }
}