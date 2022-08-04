package lesson10.homework1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 17:12
 * @Description: 1、分析以下需求，并用代码实现：
 * (1)定义数字字符串数组{"010","3223","666","7890987","123123"}
 * (2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
 * (3)如：010 是对称的，3223 是对称的，123123 不是对称的
 * (4)最终打印该数组中对称字符串的个数
 */

public class Palindrome {
    public static void main(String[] args) {
        String[] s = {"010", "3223", "666", "7890987", "123123"};
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (palin(s[i])) {
                System.out.println(s[i] + "是对称的");
                count++;
            } else {
                System.out.println(s[i] + "不是对称的");
            }
        }
        System.out.println("数组中对称的字符串个数为:" + count);


    }

    public static boolean palin(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

