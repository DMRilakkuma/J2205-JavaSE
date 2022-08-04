package lesson12.homework3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:24
 * @Description:
 */

public class Cola implements Buy {

    @Override
    public void select() {
        System.out.println("请选择买百事可乐还是可口可乐");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        switch (s) {
            case "百事可乐":
                System.out.println("购买百事可乐成功");
                break;
            case "可口可乐":
                System.out.println("购买可口可乐成功");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}