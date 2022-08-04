package lesson8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 17:06
 * @Description: //  创建四个手机("ViVo"、"小米"、"苹果"、"samsung")对象存入ArrayList集合中，并遍历输出。
 */
public class PhoneTest {
    public static void main(String[] args) {
        List<Phone> list = new ArrayList<>();
        list.add(new Phone("ViVo", 4999, "白"));
        list.add(new Phone("小米", 3999, "黑"));
        list.add(new Phone("苹果", 6999, "蓝"));
        list.add(new Phone("samsung", 8999, "绿"));
        for (Phone p : list) {
            System.out.println(p.toString());
        }
    }

}