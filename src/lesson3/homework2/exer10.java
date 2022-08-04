package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 19:06
 * @Description:
 */
public class exer10 {
    public static void main(String[] args) {
        double total = 0;
        double wage = 6000;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 12; j++) {
                total+=wage;
            }
            wage = wage * (1 + 0.005);
        }
        System.out.println(total);
    }
}