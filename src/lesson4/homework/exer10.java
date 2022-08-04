package lesson4.homework;

import sun.font.FontRunIterator;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 18:51
 * @Description:
 */
public class exer10 {
    public static void main(String[] args) {
        // 10、	使用随机数给一个10个元素的一维数组赋值,对10个整数排序。
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (100)) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}