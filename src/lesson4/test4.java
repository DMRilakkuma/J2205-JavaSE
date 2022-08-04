package lesson4;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 13:42
 * @Description:
 */
public class test4 {
    public static void main(String[] args) {
        int[] array1 = {1, 23, 54, 687, 2, 4, 56};
        //将这个数组里面的数据按照从小到大的顺序重新排列;
        // 冒泡排序
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
        //倒序
        //将排序好的数组再复制到另外一个数组中，打印出来


    }
}