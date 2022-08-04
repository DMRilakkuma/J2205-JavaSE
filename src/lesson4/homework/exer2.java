package lesson4.homework;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 16:58
 * @Description:
 */
public class exer2 {
    public static void main(String[] args) {
        // 2、	将一组数组逆序存储到新数组中
        int[] nums = new int[]{19, 0, 7, 5, 0, 2, 0, 11, 22, 32, 0};
        int[] nums2 = new int[nums.length];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            nums2[index++] = nums[i];
        }
        System.out.println(Arrays.toString(nums2));
    }
}