package lesson3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 09:41
 * @Description:
 */
public class test3 {
    public static void main(String[] args) {
        System.out.println("请输入你的分数");
        Scanner scanner = new Scanner(System.in);
        int core = scanner.nextInt();
        if(core < 60){
            System.out.println("抱歉你没及格");
        }else if(core < 70){
            System.out.println("你的成绩及格了");
        } else if (core < 80) {
            System.out.println("你的成绩良好");
        }else if (core < 90){
            System.out.println("你的成绩优秀");
        }else{
            System.out.println("你的成绩最棒，超过了90分");
        }
    }
}