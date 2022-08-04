package lesson4;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 11:35
 * @Description:
 */
public class test3 {
    public static void main(String[] args) {
        int[] array1 = {1, 23, 4, 5, 6, 7, 98};
        //查找
        System.out.print("请输入你要查询的数据:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = false;
        for (int i = 0; i < array1.length; i++) {
            if (n == array1[i]) {
                System.out.println("恭喜你查到了");
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("很抱歉没查到");
        }
    }
}