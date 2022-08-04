package lesson2;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-23 15:59
 * @Description:
 */
public class game {
    public static void main(String[] args) {
        //实现一个人机数字比大小的小游戏
        System.out.println("欢迎进入游戏");
        System.out.println("请输入0-100的一个数字");
        //定义一个scanner对象
        Scanner scanner = new Scanner(System.in);
        int core1 = scanner.nextInt();
        // core1 就是用户输入的一个数字
        //接下来生成一个0 - 100随机数
        int core2 = (int) Math.round(Math.random() * 10) * 10;
        System.out.println("电脑数字为:" + core2);
        System.out.println(core1 > core2 ? "你赢了" : "你输了");



    }


}