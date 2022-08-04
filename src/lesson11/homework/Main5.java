package lesson11.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 18:15
 * @Description:
 */

public class Main5 {
    public static void main(String[] args) {
        int[] array = {1, 43, 342, 2, 5, 76, 21, 6, 89, 21, 4, 67, 23, 1, 22, 45};

        //升序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // 降序
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(array));

//        删除数组中大于5小于50的值，并重新升序排列并打印（要求用两种或者两种以上的方式实现）
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] < 50) {
                list.add(array[i]);
            }
        }

        Object[] array1 = list.toArray();
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


    }
}