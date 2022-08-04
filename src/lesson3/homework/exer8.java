package lesson3.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 17:12
 * @Description:
 */
public class exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x > -1 && x < 3) {
            y = 2 * x;
        } else {
            y = 2 * x - 1;
        }
        System.out.println(y);
    }
}