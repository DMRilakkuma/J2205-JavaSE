package lesson11;

import java.util.Arrays;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 16:26
 * @Description:
 */
public class test2 {
    static int[] ints = {1, 5, 45, 265, 2, 10, 2};

    public static void main(String[] args) {
        Arrays.parallelSort(ints);
        int binarySearch = Arrays.binarySearch(ints, 265);
        int[] ints1 = Arrays.copyOf(ints, 5);
        for (int i : ints1) {
            System.out.println(i);
        }

        System.out.println();
    }
}
