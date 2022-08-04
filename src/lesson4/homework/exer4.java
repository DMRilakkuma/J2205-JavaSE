package lesson4.homework;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 17:07
 * @Description:
 */
public class exer4 {
    public static void main(String[] args) {
        // 4、	使用二分法从一组数中找出目标数字
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        int n = 8;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (n < nums[mid]) {
                right = mid - 1;
            } else if (n > nums[mid]) {
                left = mid + 1;
            }else{
                System.out.println("位置为："+(mid+1));
                break;
            }
        }
        if(left > right){
            System.out.println("没有找到");
        }
    }
}