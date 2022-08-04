package lesson4.homework;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 18:45
 * @Description:
 */
public class exer9 {
    public static void main(String[] args) {
        // 9、	对一组随机赋值的int类型的数组，找出其中的最大值和最小值
        int[] arr = new int[8];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100)) + 1;
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);

    }
}