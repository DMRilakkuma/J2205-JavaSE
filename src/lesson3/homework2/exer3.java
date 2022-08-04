package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 18:54
 * @Description:
 */
public class exer3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0){
                continue;
            }
            System.out.println(i);

        }
    }
}