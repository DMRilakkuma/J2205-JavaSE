package lesson3.homework;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 17:03
 * @Description:
 */
public class exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int wage = scanner.nextInt();
        if (age >= 10 && age < 15) {
            wage += 5000;
        } else if (age >= 5) {
            wage += 2500;
        } else if (age >= 3) {
            wage += 1000;
        } else if (age >= 1) {
            wage += 500;
        } else if (age >= 0) {
            wage += 200;
        }

        System.out.println("你目前工作了"+age+"年，"+"基本工资为"+wage);
    }
}