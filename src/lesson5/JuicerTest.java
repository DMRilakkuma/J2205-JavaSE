package lesson5;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 14:29
 * @Description:
 */
public class JuicerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入 需要榨汁的水果数量
        Juicer juicer = new Juicer();
        System.out.println(juicer.getJuice("蓝莓", "苹果", "香蕉"));

    }
}