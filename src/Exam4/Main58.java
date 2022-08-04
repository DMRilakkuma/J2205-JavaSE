package Exam4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 09:41
 * @Description:
 */

public class Main58 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.next();
        System.out.println("请输入要被查找的字符串:");
        String search = scanner.next();
        List<Integer[]> list = find(str, search);
        for (Integer[] in : list) {
            System.out.println(Arrays.toString(in));
        }

    }

    public static List<Integer[]> find(String str, String search) {
        List<Integer[]> list = new ArrayList<>();
        int left = 0;
        int right = left + search.length() - 1;

        while (right < str.length()) {
            if (str.substring(left, right + 1).equals(search)) {
                list.add(new Integer[]{left, right});
            }
            left++;
            right++;
        }
        return list;
    }

}