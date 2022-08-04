package lesson11.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 17:52
 * @Description:
 */

public class Main1 {
    public static void main(String[] args) {
        for (int i = -5; i <= 8; i = i+1) {
            if(Math.abs(i) > 5.3 || Math.abs(i) < 2.1){
                System.out.println(i);
            }
        }
    }
}