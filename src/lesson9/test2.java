package lesson9;

import org.testng.annotations.Test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 14:32
 * @Description:
 */

public class test2 {
    public static void main(String[] args) {
        Integer i = new Integer("0");
        String str = new String("123");
        System.out.println(Integer.compare(2, 1));
        Integer.parseInt("1232332", 10);
        System.out.println(Integer.toBinaryString(10));

    }

    @Test
    public void test() {
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);

        Integer i3 = 130;
        Integer I4 = 130;
        System.out.println(i3 == I4);

        Integer i5 = 130;
        Integer I6 = 130;
        System.out.println(i5 == I6);
    }

    @Test
    public void test2() {
        Integer s1 = 120;
        Integer s2 = 220;
        s1 = s1 + 100;
        System.out.println(s1 == s2);
    }
}