package lesson14.exer2;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 19:04
 * @Description:
 */

public class Main3 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0 && n > 200) {
            throw new Exception("年龄不能为负数和大于200岁");
        }
    }
}