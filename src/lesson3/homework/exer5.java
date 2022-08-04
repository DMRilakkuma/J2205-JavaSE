package lesson3.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 16:31
 * @Description:
 */
public class exer5 {
    public static void main(String[] args) {
        // 5、	使用switch制作一个简单的计算器：
        //让用户输入计算数字1和运算符 及计算数字2，然后程序帮他计算出结果。
        //（运算符用数字来替换：1---> +   2--->-  3 --->*  4--->/）
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("请输入4以内的整数");
        }

    }
}