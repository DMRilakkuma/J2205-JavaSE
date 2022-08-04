package Exam4.Exer62;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 10:26
 * @Description:
 */

public class Main62 {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        list.add(new Worker("zhang3", 18, 3000));
        list.add(new Worker("li4", 25, 3500));
        list.add(new Worker("wang5", 22, 3200));

        list.add(1, new Worker("zhao6", 24, 3300));
        for (Worker w : list) {
            if (w.getName().equals("wang5")) {
                list.remove(w);
                break;
            }
        }
        double total = 0;
        for (Worker w : list) {
            total += w.getWage();
            System.out.println(w);
        }

        System.out.println("工人平均工资为:" + total / list.size());
    }
}