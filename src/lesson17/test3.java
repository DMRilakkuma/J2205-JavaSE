package lesson17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 14:38
 * @Description:
 */

public class test3 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("a");
        set.add("王兵");
        set.add("帅哥");
        set.add(true);
        set.add("帅哥");

        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}