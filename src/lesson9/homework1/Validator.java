package lesson9.homework1;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 13:48
 * @Description: 完成一个验证码生成器，要求能够随机生成0~9，a~z，A~Z之间长度为4位的验证码，并完成一个验证过程
 */

public class Validator {
    public static void main(String[] args) {
        String randomVerify = new String();
        for (int i = 0; i < 4; i++) {
            int n = (int) (Math.random() * (10 + 26 + 26));
            if (n <= 9) {
                randomVerify += n;
            } else if (n <= 35) {
                randomVerify += ((char) (n + 55));
            } else {
                randomVerify += ((char) (n + 61));
            }
        }
        System.out.println("验证码: " + randomVerify);
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入验证码: ");
        String verify = scanner.next();

        if (randomVerify.equals(verify)) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }

    }

}