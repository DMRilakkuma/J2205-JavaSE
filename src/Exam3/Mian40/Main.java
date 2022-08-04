package Exam3.Mian40;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 10:06
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = s.replace("性", "*");
        s = s.replace("色情", "**");
        s = s.replace("爆炸", "**");
        s = s.replace("恐怖", "**");
        s = s.replace("抢", "*");
        s = s.replace("军火", "**");
        System.out.println(s);
        
    }
}