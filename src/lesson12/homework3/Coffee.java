package lesson12.homework3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:18
 * @Description:
 */

public class Coffee implements Buy {

    @Override
    public void select() {
        System.out.println("加糖，加奶还是什么都不加");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        switch (s) {
            case "加糖":
                System.out.println("加糖成功");
                break;
            case "加奶":
                System.out.println("加奶成功");
                break;
            case "什么都不加":
                System.out.println("什么都不加");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}

