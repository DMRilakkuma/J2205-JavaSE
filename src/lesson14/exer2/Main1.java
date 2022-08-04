package lesson14.exer2;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 18:57
 * @Description:
 */

public class Main1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double area;
        try {
            if (n <= 0) {
                throw new Exception();
            }
            area = Math.PI * Math.pow(n, 2);
        } catch (Exception e) {
            throw new Exception("半径不能为0或者负数");
        }

        System.out.println(area);
    }
}