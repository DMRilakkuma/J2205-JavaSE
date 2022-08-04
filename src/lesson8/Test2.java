package lesson8;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 16:24
 * @Description:
 */
public class Test2 {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = new String("a");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}