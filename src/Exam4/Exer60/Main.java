package Exam4.Exer60;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 10:10
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        list.add(new Dog("兰松柏", "哈士奇", 78));
        list.add(new Dog("李伟", "阿拉斯加", 50));
        list.add(new Dog("彭彦喆", "土狗", 59));
        list.add(new Dog("李腾", "法国斗牛犬", 67));
        list.add(new Dog("金烨涛", "金毛巡回犬", 67));

        int count = 0;
        for (Dog dog : list) {
            if (dog.getHealthValue() < 60) {
                System.out.println(dog);
                count++;
            }
        }
        System.out.println(count);

    }
}