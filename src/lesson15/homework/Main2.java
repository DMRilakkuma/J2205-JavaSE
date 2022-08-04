package lesson15.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 18:06
 * @Description:
 */

public class Main2 {
    public static void main(String[] args) {
        String str = "svd9876fsb543fdg210";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && (int) (str.charAt(i) - 48) % 2 == 0) {
                list.add(i);
            }
        }
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = str.charAt(list.get(i)) - 48;
        }


        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(ints));
    }
}