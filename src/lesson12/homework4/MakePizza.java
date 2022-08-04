package lesson12.homework4;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:31
 * @Description:
 */

public class MakePizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("要制作培根比萨还是海鲜比萨");
        String s = scanner.next();
        if ("培根比萨".equals(s)) {
            System.out.println("制作培根比萨成功");
        } else if ("海鲜比萨".equals(s)) {
            System.out.println("制作海鲜比萨成功");
        } else {
            System.out.println("输入错误");
        }

    }
}