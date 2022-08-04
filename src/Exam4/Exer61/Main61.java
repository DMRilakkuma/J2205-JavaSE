package Exam4.Exer61;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 10:16
 * @Description:
 */

public class Main61 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("兰松柏", 77);
        map.put("彭彦喆", 99);
        map.put("李伟", 66);
        map.put("李腾", 59);
        map.put("邓密", 12);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String s = scanner.next();
        System.out.println("请输入需要修改的成绩:");
        int anInt = scanner.nextInt();
        Set<String> set = map.keySet();
        boolean isFlag = false;
        for (String str : set) {
            if (s.equals(str)) {
                map.put(s, anInt);
                isFlag = true;
            }
        }
        if (isFlag) {
            System.out.println("修改成功");
        } else {
            System.out.println("查无此人");
        }

    }
}