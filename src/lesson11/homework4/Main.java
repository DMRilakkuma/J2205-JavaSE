package lesson11.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 18:08
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Compare compare = new Compare();
        System.out.println(compare.quite(1, 2));
        System.out.println(compare.product(1.0, 2.0, 3.0));
        System.out.println(compare.same("123", "345"));

    }
}