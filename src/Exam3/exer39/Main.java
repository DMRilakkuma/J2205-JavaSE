package Exam3.exer39;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 10:03
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = -15; i <= 8; i++) {
            if (Math.abs(i) > 10 || Math.abs(i) < 5) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}