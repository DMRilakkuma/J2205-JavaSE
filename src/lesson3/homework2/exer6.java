package lesson3.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 18:59
 * @Description:
 */
public class exer6 {
    public static void main(String[] args) {
        int count = 1;
        int total = 1;
        while(count <= 10){
            total*= count;
            count++;
        }
        System.out.println(total);
    }
}