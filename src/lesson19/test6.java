package lesson19;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 14:46
 * @Description:
 */

public class test6 {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[]{2, 9, 7, 5, 8, 1, 4, 3, 0});
        stream.filter(u -> u >= 2 && u <= 9)
                .sorted()
                .distinct()
                .skip(1)
                .limit(2)
                .forEach(i -> System.out.println(i));

        IntStream stream1 = Arrays.stream(new int[]{2, 9, 7, 5, 8, 1, 4, 3, 0});
        stream1.count();
    }
}