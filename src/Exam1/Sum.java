package Exam1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 16:00
 * @Description:
 */
public class Sum {
    public static void main(String[] args) {
        long total = 0;
        for (long i = 1; i <= 20; i++) {
            total+=recursion(i);
        }
        System.out.println(total);
    }
    public static long recursion(long num) {
        if (num == 1) {
            return 1;
        }
        return num * recursion(num-1);
    }
}