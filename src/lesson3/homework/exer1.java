package lesson3.homework;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 15:52
 * @Description:
 */
public class exer1 {
    public static void main(String[] args) {
        // 1、	让用户输入一个100以内的整数x，再输入一个100到200之间的整数y，然后程序随机一个x到y之间的整数并打印。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个100以内的整数x:");
        int x = scanner.nextInt();
        System.out.println("请输入一个100到200之间的整数y:");
        int y = scanner.nextInt();
        int v = (int) (Math.random() * (y - x)) + x;
        System.out.println(v);
    }

}