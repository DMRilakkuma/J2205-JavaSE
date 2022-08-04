package lesson11.homeowrk2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 17:24
 * @Description:
 */

public class Mian {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.addition(1, 1);
        a.addition(1, 2.0);
        a.addition(2, 3.0f);
        a.addition(2, "");
        a.addition(1.0, 1.0);
        a.addition(1.0,"");
        a.addition(1.0f,"");
    }
}