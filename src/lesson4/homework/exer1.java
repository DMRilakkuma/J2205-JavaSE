package lesson4.homework;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 16:51
 * @Description:
 */
public class exer1 {
    public static void main(String[] args) {
        //1、	有一个数组{19,0,7,5,0,2,0,11,22,32,0}，将数组中非0的数存储到一个新数组中
        int[] nums = new int[]{19, 0, 7, 5, 0, 2, 0, 11, 22, 32, 0};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
            }
        }
        //定义一个固定长度的数组
        int[] nums2 = new int[count];
        int index = 0;
        for (int i : nums) {
            if (i != 0) {
                nums2[index++] = i;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}