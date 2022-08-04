package Exam1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 15:33
 * @Description: //
 */
public class monkey {
    public static void main(String[] args) {
        int total = 1;
        for (int i = 0; i < 9; i++) {
            total = (total + 1) * 2;
        }
        System.out.println(total);
    }
}