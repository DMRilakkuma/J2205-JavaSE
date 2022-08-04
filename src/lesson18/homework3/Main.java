package lesson18.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 16:48
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(Arrays.asList(new Student(40, 20, "peter"),
                new Student(28, 5, "angel")
                , new Student(35, 18, "tom")));

        Collections.sort(list);
        System.out.println(list);
    }
}