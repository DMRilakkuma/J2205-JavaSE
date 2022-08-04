package lesson18.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 16:41
 * @Description:
 */

public class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("orange", "tomato", "apple", "litchi"
                , "banana"));

        Collections.sort(list);
        System.out.println(list);

    }
}