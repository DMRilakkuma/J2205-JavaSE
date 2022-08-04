package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:03
 * @Description:
 */
public class exer8 {
    public static void main(String[] args) {
        int count = 1;
        int total = 0;
        while (total <= 500) {
            total+=count;
            count++;
        }
        System.out.println(total);
    }
}