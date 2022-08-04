package lesson17.homework.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 18:06
 * @Description:
 */

public class Main2 {
    static Map<Integer, Champion> maps = new HashMap<Integer, Champion>();

    public static void main(String[] args) {
        maps.put(1930, new Champion(1, 1930, "乌拉圭", "乌拉圭"));
        maps.put(1934, new Champion(2, 1934, "意大利", "意大利"));
        maps.put(1938, new Champion(3, 1938, "法国", "意大利"));
        maps.put(1950, new Champion(4, 1950, "巴西", "乌拉圭"));
        maps.put(1954, new Champion(5, 1954, "瑞士", "西德"));
        maps.put(1958, new Champion(6, 1958, "瑞典", "巴西"));
        maps.put(1962, new Champion(7, 1962, "智利", "巴西"));
        maps.put(1966, new Champion(8, 1966, "英格兰", "英格兰"));
        maps.put(1970, new Champion(9, 1970, "墨西哥", "巴西"));
        maps.put(1974, new Champion(10, 1974, "前西德", "西德"));
        maps.put(1978, new Champion(11, 1978, "阿根廷", "阿根廷"));
        maps.put(1982, new Champion(12, 1982, "西班牙", "意大利"));
        maps.put(1986, new Champion(13, 1986, "墨西哥", "阿根廷"));
        maps.put(1990, new Champion(14, 1990, "意大利", "西德"));
        maps.put(1994, new Champion(15, 1994, "美国", "巴西"));
        maps.put(1998, new Champion(16, 1998, "法国", "法国"));
        maps.put(2002, new Champion(17, 2002, "韩日", "巴西"));
        maps.put(2006, new Champion(18, 2006, "德国", "意大利"));
        maps.put(2010, new Champion(19, 2010, "南非", "西班牙"));
        maps.put(2014, new Champion(20, 2014, "巴西", "德国"));

        championOfInquiry();
        awardRecord("巴西");


    }

    public static void championOfInquiry() {
        /*
         * @author MC
         * @description //TODO 从控制台读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队
         * @createTime  2022-07-19 18:18
         * @param inquiry
         * @return void
         **/

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Set<Map.Entry<Integer, Champion>> entries = maps.entrySet();
        for (Map.Entry<Integer, Champion> entry : entries) {
            if (entry.getValue().getYear() == year) {
                System.out.println(entry.getValue().getChampion());
                return;
            }
        }
        System.out.println("没有举行世界杯");

        if (maps.containsKey(year)) {
            System.out.println(maps.get(year).getChampion());
        } else {
            System.out.println(year + "没有获得世界杯!!!");
        }


    }

    public static void awardRecord(String name) {
        boolean isFlag = true;
        Set<Map.Entry<Integer, Champion>> entries = maps.entrySet();
        for (Map.Entry<Integer, Champion> entry : entries) {
            if (name.equals(entry.getValue().getChampion())) {
                isFlag = false;
                System.out.println(entry.getValue().getYear() + " ");
            }
        }
        if (isFlag) {
            System.out.println("没有获得世界杯");
        }
    }


}