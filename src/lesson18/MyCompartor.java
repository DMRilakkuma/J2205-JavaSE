package lesson18;

import java.util.Comparator;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 14:57
 * @Description:
 */

public class MyCompartor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}