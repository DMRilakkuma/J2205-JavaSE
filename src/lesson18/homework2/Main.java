package lesson18.homework2;

import java.util.*;

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

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(list);
    }
}