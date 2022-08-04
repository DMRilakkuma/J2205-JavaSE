package lesson5;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 15:59
 * @Description:
 */
public class test3 {
    public static void main(String[] args) {
        // 使用mian方法去调用其他方法
        int result = recursion(3);
        System.out.println(result);
        sequence();
    }

    // 递归 : 方法自己调用自己
    // 使用递归去实现5！;
    public static int recursion(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * recursion(number - 1);
        }
    }

    public static int recursion2(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + recursion2(number - 1);
        }
    }

    //斐波那锲且数列
    // 1,1,2,3,5,8,13,21

    // 使用for循环打印一个斐波那锲数列
    public static void sequence() {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || i == 1) {
                a[i] = 1;
            } else {
                // 第三位的值等于前两位值的和
                a[i] = a[i - 1] + a[i - 2];
            }
        }
        // 将生成的有100位的斐波那锲数列打印出来
        System.out.println(Arrays.toString(a));
    }


    public static int recursion3(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }else{
            return  recursion3(number-1)+recursion3(number-2);
        }

    }
}