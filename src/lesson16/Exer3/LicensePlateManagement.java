package lesson16.Exer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 17:22
 * @Description:
 */

public class LicensePlateManagement {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s = "京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼";
        String s2 = "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ";

        while (true) {
            String plate = "";
            int n = (int) (Math.random() * (s.length() - 1 - 0 + 1));
            plate = plate + s.charAt(n) + "·";
            for (int i = 0; i < 5; i++) {
                int n2 = (int) (Math.random() * (s2.length() - 1 - 0 + 1));
                plate += s2.charAt(n2);
            }
            if (list.contains(plate)) {
                continue;
            }
            System.out.println(plate);
            System.out.println("是否选择此车牌(输入s选择c此车牌 / 输入exit即可退出):");
            String s1 = scanner.next();
            if ("s".equals(s1)) {
                list.add(plate);
            } else if ("exit".equals(s1)) {
                System.out.println("退出成功");
                break;
            } else {
                System.out.println("请重新输入:");
            }
        }

        for (String str : list) {
            System.out.println(str);
        }
    }

}