package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 09:35
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // 但是list类中的默认方法，Arraylist就不能直接使用
        List list = new ArrayList();
        list.add("兰松柏");
        list.add("王兵");
        list.add("李伟");
        list.add("郭义轩");
        list.add(null);
        list.add(1);
        list.add(1, "卢力凯");

        list.set(4, "赵栋");

        // 为什么list里面可以添加不同类型的数据
        // 因为list底层是一个Object[]
        System.out.println(list);

        List list1 = list.subList(0, 3);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);
//        System.out.println(list.contains("王兵"));


    }
}