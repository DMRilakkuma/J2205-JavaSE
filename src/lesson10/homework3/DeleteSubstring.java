package lesson10.homework3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 18:07
 * @Description:
 */

public class DeleteSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入两个字符串:");
            String s1 = scanner.next();
            if ("end".equals(s1)) {
                System.out.println("判断结束");
                break;
            }
            String s2 = scanner.next();

            Object[] objects = deleteSubstring(s1, s2);
            System.out.println(Arrays.toString(objects));
        }
    }

    public static Object[] deleteSubstring(String s1, String s2) {
        Object[] object = new Object[2];
        if (s1.length() < s2.length()) {
            return null;
        }
        int left = 0;
        int right = s2.length() - 1;
        int count = 0;
        StringBuilder stringBuffer = new StringBuilder(s1);
        while (right < stringBuffer.length()) {
            if (stringBuffer.substring(left, right + 1).equals(s2)) {
                stringBuffer.delete(left, right + 1);
                count++;
                if (stringBuffer.length() < s2.length()) {
                    break;
                }
            } else {
                left++;
                right++;
            }
        }
        object[0] = stringBuffer;
        object[1] = count;
        return object;

        //将str1字符串使用replaceAll（）,在str1中将str2替换为空格
//        s1 = s1.replaceAll(s2, " ");
//        // 计算空格在字符串1中的空格
//        s1.split(" ");

    }
}