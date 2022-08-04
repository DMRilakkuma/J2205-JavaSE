package lesson5.homework3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 18:26
 * @Description: 1、	将以下需求写在同一个类中,每个需求写一个方法
 * (1)键盘录入两个数据,求两个数据之和(整数和小数)
 * (2)键盘录入两个数据,判断两个数据是否相等(整数和小数)
 * (3)键盘录入三个数据,获取三个数中较大的值(整数和小数)
 * (4)打印nn乘法表
 * (5)计算长方形和圆形的面积
 */
public class Exer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double z = scanner.nextInt();
        int k = scanner.nextInt();
        Exer exer = new Exer();
        // 两数之和
        System.out.println(exer.sum(x, y));

        // 判断两个数据是否相等
        System.out.println(exer.judgment(x, z));

        // 获取三个数中较大的值
        System.out.println(exer.compare(x, z, k));

        //打印乘法表
        exer.multiplicationTable(x);

        //计算长方形的面积
        System.out.println(exer.rectangleArea(x, y));

        //计算圆形面积
        System.out.println(exer.circularArea(x));


    }

    // 两个数据之和
    public double sum(int x, double y) {
        return x + y;
    }

    // 判断两个数据是否相等
    public boolean judgment(int x, double y) {
        return x == y;
    }

    // 获取三个数中较大的值
    public double compare(int x, double y, double z) {
        return Math.max(Math.max(x, y), z);
    }

    // 打印nn乘法表
    public void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
        }
    }

    //计算长方形的面积
    public int rectangleArea(int x, int y) {
        return x * y;
    }

    // 计算圆形面积
    public double circularArea(double r) {
        return Math.PI * r * r;
    }

}