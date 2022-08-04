package Exam2;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:22
 * @Description:
 */

public class Main27 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[arr.length - 1 - i] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}