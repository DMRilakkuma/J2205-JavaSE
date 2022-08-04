package lesson4.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 18:39
 * @Description:
 */
public class exer7 {
    public static void main(String[] args) {
        // 7、定义一个数组，由键盘输入值来赋值，并输出该数组的各值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组大小:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入" + "n" + "个数组元素:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}