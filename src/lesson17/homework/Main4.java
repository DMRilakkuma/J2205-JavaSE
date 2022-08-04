package lesson17.homework;

import java.util.*;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 18:36
 * @Description:
 */

public class Main4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰",
                "尼日利亚", "日本", "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"));

        Map<Integer, List> map = new HashMap<>();
        Random random = new Random();
        int index = list.size();
        List list2 = new ArrayList<>();
        while (index > 0) {
            int nextInt = random.nextInt(list.size());
            list2.add(list.get(nextInt));
            index--;
            list.remove(nextInt);

            if (list2.size() == 4) {
                map.put(map.size() + 1, list2);
                list2 = new ArrayList<>();
            }
        }
        Set<Map.Entry<Integer, List>> entries = map.entrySet();
        for (Map.Entry<Integer, List> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}