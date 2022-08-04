package lesson11;

import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 15:46
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        BigDecimal bigDecimal = new BigDecimal(0.1);
        System.out.println(bigDecimal);
        System.out.println(a + b);
    }

    @Test
    public void test() {
        double b = Math.PI;
        System.out.println(b);
        System.out.println(Math.addExact(1, 1));
    }

    @Test
    public void test2() {
        System.out.println(Math.ceil(0.1));
        System.out.println(Math.floor(0.8));
        System.out.println(Math.round(0.5));


        //随机数公式
        double v = Math.random() * (10 - 1 + 1) + 1;
        System.out.println(Math.nextUp(0.1));
    }

    static String number = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    @Test
    public void test3() {
        System.out.println(getCode(4));
    }

    public static String getCode(int n) {
        int c = -1;
        String result = "";
        for (int i = 0; i < n; i++) {
            c = (int) (Math.random() * (61 - 0 + 1) + 0);
            result += number.charAt(c);
        }
        return result;
    }

    @Test
    public void test4() {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
    }
}