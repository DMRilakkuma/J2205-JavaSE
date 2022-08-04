package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 16:14
 * @Description:
 */
public class exer3 {
    public static void main(String[] args) {
        // 3、	用户输入3个整数，将这个3个整数从大到小打印出来。
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        Arrays.sort(arr);
        for (int i = 2; i >=0 ; i--) {
            System.out.println(arr[i]);
        }

    }
}