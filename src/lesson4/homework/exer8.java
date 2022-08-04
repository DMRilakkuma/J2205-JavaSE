package lesson4.homework;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 18:44
 * @Description:
 */
public class exer8 {
    public static void main(String[] args) {
        // 8、	用随机数给一个整型数组赋值,并对数组求和。（范围自定
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100)) +1;
        }
        System.out.println(Arrays.toString(arr));
    }
}