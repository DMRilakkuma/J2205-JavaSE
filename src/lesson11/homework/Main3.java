package lesson11.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 17:58
 * @Description:
 */

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("dfhfdjfk");
        list.add("fryhf");
        list.add("uyyh");
        list.add("fjdhskjhfjshfdhs");
        for (String s : list) {
            if (s.length() <= 5) {
                list2.add(s);
            }
        }
        // 遍历结果
        System.out.println(list2.toString());
    }
}