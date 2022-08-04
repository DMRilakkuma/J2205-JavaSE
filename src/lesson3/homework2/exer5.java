package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 18:57
 * @Description:
 */
public class exer5 {
    public static void main(String[] args) {
        int count = 0;
        int total = 1;
        while(count < 5){
            total += total * 10 + 1;
            count++;
        }
        System.out.println(total);
    }
}