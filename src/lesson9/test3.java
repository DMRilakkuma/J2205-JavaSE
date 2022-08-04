package lesson9;

import org.testng.annotations.Test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 16:08
 * @Description:
 */

public class test3 {
    @Test
    public void test1() {
        String s1 = "123";
        s1 = s1 + "456";
        System.out.println(s1);
    }

    @Test
    public void test2() {
        String s1 = new String("123");
        char[] s2 = {'1', '2', '3'};
    }

    @Test
    public void test3() {
        String s1 = "12356ABCEDFG";
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(s1.length() - 1));

        // 将字符串s1以16进制打印
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            System.out.println("0x" + Integer.toHexString(a));
        }
        System.out.println("Hello".compareTo("world"));
    }
}