package lesson19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 08:49
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        Service<Student> s = new Service<>();
        Service<Teacher> s2 = new Service<>();
        List list = new ArrayList();
        list.add(111);
        list.add('a');
        list.add("dsadsa");
        list.add(new String("dsad"));
        list.add(true);
        for (Object o : list) {
//            String ds = (String)o;
            if (o instanceof Integer) {
                int aaa = (int) o;
            }
        }

        // 原本list集合是可以存放不同类型的数据，但是一旦给这个集合添加对应的泛型以后
        // 这个list集合就变成了单一一种类的集合
        List<String> list1 = new ArrayList<>();

        Teacher teacher = getT(new Teacher("teacher"));

        String str = getT(new String("str"));

    }

    public static <T> T getT(T t) {
        System.out.println(t);
        return t;
    }
}