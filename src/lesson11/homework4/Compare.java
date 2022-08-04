package lesson11.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 17:31
 * @Description:
 */

public class Compare {
    //  1、传递两个整数值并找出其中较大的一个值
    public int quite(int a, int b) {
        return Math.max(a, b);
    }

    // 2、传递三个 double 值并求出其乘积
    public double product(double a, double b, double c) {
        return a * b * c;
    }

    // 传递两个字符串值并检查其是否相同
    public boolean same(String s1, String s2) {
        return s1.equals(s2);
    }
    

}