package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:12
 * @Description:
 */
public class exer12 {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}