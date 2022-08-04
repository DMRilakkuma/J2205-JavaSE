package lesson18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 14:31
 * @Description:
 */

public class test2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Collections.addAll(list, new Student(6, "wdfw"), new Student(4, "dgddh"), new Student(3, "jds"),
                new Student(5, "bhbgh"), new Student(7, "sdsd"));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });

        Collections.sort(list, new MyCompartor());

        System.out.println(list);


    }
}