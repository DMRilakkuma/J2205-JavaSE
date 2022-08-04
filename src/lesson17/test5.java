package lesson17;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 16:26
 * @Description:
 */

public class test5 {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("abc1", "hello");
        map.put("abc2", "hello");
        map.put("abc3", "hello");
        map.put("abc4", "hello");
        map.put("abc5", "hello");
        map.put("abc6", "hello");
        map.put("abc7", "hello");

        Set<Map.Entry> set = map.entrySet();
        for (Map.Entry entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        Map<Student, Object> map1 = new TreeMap<>();
        map1.put(new Student("张三", 21), "123");
        map1.put(new Student("张三", 29), "123");
        map1.put(new Student("张三", 25), "123");
        map1.put(new Student("张三", 32), "123");
        map1.put(new Student("张三", 34), "123");
        map1.put(new Student("张三", 23), "123");
        map1.put(new Student("张三", 60), "123");

        Set<Map.Entry<Student, Object>> entries = map1.entrySet();
        for (Map.Entry<Student, Object> entry : entries) {
            System.out.println(entry.getKey().toString() + "=" + entry.getValue());
        }
    }
}