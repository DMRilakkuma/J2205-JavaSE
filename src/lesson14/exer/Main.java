package lesson14.exer;

import java.util.Random;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 18:37
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100 * 100);
        System.out.println(i);
    }
}