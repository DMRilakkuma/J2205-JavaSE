package lesson4.homework;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 17:01
 * @Description:
 */
public class exer3 {
    public static void main(String[] args) {
        // 3、	完成一组无序整数的排序(算法不限)
        int[] nums = new int[]{19, 0, 7, 5, 0, 2, 0, 11, 22, 32, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}