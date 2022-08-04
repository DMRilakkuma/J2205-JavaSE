package lesson3.homework2;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:14
 * @Description:
 */
public class exer13 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int x = i % 10;
            int y = i % 100/10;
            int z = i /100;
            int total = (int) (Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3));
            if(total == i){
                System.out.println(i);
            }
        }

    }
}