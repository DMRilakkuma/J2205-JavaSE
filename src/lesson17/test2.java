package lesson17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 14:12
 * @Description:
 */

public class test2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(8);
        set.add(11);
        set.add(5);
        set.add(3);

        System.out.println(set);

        Set<String> set2 = new HashSet<String>();
        set2.add("a");
        set2.add("c");
        set2.add("f");
        set2.add("b");
        System.out.println(set2);

        Set<Student> students = new TreeSet<>();
        students.add(new Student("李四", 27));
        students.add(new Student("王五", 23));
        students.add(new Student("张三", 20));

        System.out.println(students.toString());


    }
}