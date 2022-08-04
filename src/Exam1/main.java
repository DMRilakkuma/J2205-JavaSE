package Exam1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 15:16
 * @Description:
 */
public class main {
    public static void main(String[] args) {
        B b = new B();
        A a = b;
        System.out.println(b.i);
        System.out.println(a.i);
        System.out.println( (int) (8.5 + 4.6) /3 % 4);
    }
}