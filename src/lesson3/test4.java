package lesson3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 10:31
 * @Description:
 */
public class test4 {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩");
        Scanner scanner = new Scanner(System.in);
        int core = scanner.nextInt();
        switch (core / 10) {
            case 6: //case中的值是固定值
                System.out.println("你的成绩是及格");
                break; //直接结束当前switch判断
            case 7:
                System.out.println("你的成绩是良好");
                break;
            case 8:
                System.out.println("你的成绩是优良");
                break;
            case 9:
                System.out.println("你的成绩是优秀");
                break;
            case 10:
                System.out.println("很帮，你的成绩是100分");
                break;
            default:
                System.out.println("结束");
        }

    }
}