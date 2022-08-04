package lesson18.homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 17:06
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        List<Staff> list = new ArrayList<>();
        list.add(new Staff("emp001", "张三", 1800.0f));
        list.add(new Staff("emp002", "李四", 2500.0f));
        list.add(new Staff("emp003", "王五", 1600.0f));

        Collections.sort(list);
        System.out.println(list);
    }
}