package Exam1;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 16:06
 * @Description:
 */
public class SortBinary {
    public static void main(String[] args) {
        int[] a = {4, 7, 3, 4, 5, 1, 9, 8, 11, 12, 6, 18, 10, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] > 12) {
                right = mid - 1;
            } else if (a[mid] < 12) {
                left = mid+1;
            }else{
                System.out.println(mid);
                break;
            }
        }
    }
}