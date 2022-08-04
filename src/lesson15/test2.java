package lesson15;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 09:34
 * @Description:
 */

public class test2 {
    public static void main(String[] args) {
        String s1 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s2 = "";
        System.out.println(recursion(s1, s2));
    }

    public static String recursion(String s1, String s2) {
        if (s2.length() == 6) {
            return s2;
        }
        int v = (int) (Math.random() * s1.length());
        char c = s1.charAt(v);
        if (s2.indexOf(c) == -1) {
            s2 += s1.charAt(v);
        }

        return recursion(s1, s2);
    }
}