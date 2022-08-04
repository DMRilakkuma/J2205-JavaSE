package lesson3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 09:14
 * @Description:
 */
public class day03 {
    public static void main(String[] args) {
        String watermelon = "西瓜";
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        if (user.equals(watermelon) && 0 == 0) {
            System.out.println("买西瓜");
        } else {
            System.out.println("买两个包子");
        }
    }
}