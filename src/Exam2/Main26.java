package Exam2;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:18
 * @Description:
 */

public class Main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        while(true){
            String s = scanner.next();
            if(s.length() == 6){
                System.out.println("输入成功");
                break;
            }
            System.out.println("请重新输入：");
        }
    }
}