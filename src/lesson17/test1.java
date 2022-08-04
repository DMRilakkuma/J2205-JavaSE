package lesson17;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 11:02
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("abc");
        set.add("cba");
        set.add(123);
        set.add(true);
        set.add('s');
        set.add(123);

        for (Object o : set) {
            System.out.println(o);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }

    @Test
    public void test() {
        Set<Student> set = new HashSet<Student>();
        set.add(new Student("张麻子", 20));
        set.add(new Student("张麻子", 20));

        System.out.println(set);
    }
}