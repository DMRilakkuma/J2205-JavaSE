package lesson18;

import java.util.*;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 13:55
 * @Description:
 */

public class test {
    public static void main(String[] args) {
        // 表示当前集合中所存放的类型，这个类型必须是引用类或者封装类

        //同时还看一看存放的自定义的实体类，如果不写的默认使用Object
        List<Integer> list = new ArrayList<>();
        Set set = new HashSet<>();
        Collections.addAll(list, 5, 2, 6, 3, 6, 8);
        Collections.sort(list);
        System.out.println(list);
        int res = Collections.binarySearch(list, 5);
        System.out.println(res);

        List<String> strlist = new ArrayList<>();
        Collections.addAll(strlist, "张", "王", "赵", "全", "诸葛");
        Collections.sort(strlist);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list);


    }
}