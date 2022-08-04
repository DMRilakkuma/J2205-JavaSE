package Exam3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 10:20
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("A");
        StringBuilder s2 = new StringBuilder("B");
        mbop(s1, s2);
        System.out.println(s1 + "." + s2);

    }

    static void mbop(StringBuilder s1, StringBuilder s2) {
        s1.append(s2);
        s2 = s1;
    }
}