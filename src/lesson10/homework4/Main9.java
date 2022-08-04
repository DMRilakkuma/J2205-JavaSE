package lesson10.homework4;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 18:59
 * @Description:
 */

public class Main9 {
    // 滑动窗口
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String sub = scanner.next();
        int left = 0;
        int right = left + sub.length() - 1;
        int count = 0;
        while (right < s.length()) {
            if (s.substring(left, right + 1).equals(sub)) {
                count++;
                left += sub.length();
                right += sub.length();
            } else {
                left++;
                right++;
            }
        }
        System.out.println(count);
    }

}
