package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:40
 * @Description:
 */
public class exer15 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1900; i <= 2022; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i+"为闰年");
                count++;
            }
        }
        System.out.println(count);
    }
}