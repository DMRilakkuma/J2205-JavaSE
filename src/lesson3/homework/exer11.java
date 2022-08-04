package lesson3.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 17:21
 * @Description:
 */
public class exer11 {
    public static void main(String[] args) {
        int n = 50;
        for (int i = 2; i <=n; i++) {
            if(n % i == 0){
                System.out.println("n不是质数");
                return;
            }
        }
        System.out.println("n是质数");
    }
}