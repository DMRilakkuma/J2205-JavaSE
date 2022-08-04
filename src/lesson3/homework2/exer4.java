package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 18:55
 * @Description:
 */
public class exer4 {
    public static void main(String[] args) {
        int height = 8848;
        double thickness = 0.01;
        int count = 0;
        while (thickness <= height) {
            thickness *= 2;
            count++;
        }
        System.out.println(count);
    }
}