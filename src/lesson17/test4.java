package lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 15:31
 * @Description:
 */

public class test4 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name1", "张三");
        map.put("name2", "刘备");
        map.put("name3", "张三");
        map.put("age", 2);
        map.remove("name3");
        Set set = map.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // 使用foreach循环map
        // 将entrySet()将map中所有的entry节点放入一个set集合中
        Set<Map.Entry> entrySet = map.entrySet();
        for (Map.Entry e : entrySet) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }


    }
}