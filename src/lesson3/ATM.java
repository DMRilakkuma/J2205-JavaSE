package lesson3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 14:33
 * @Description:
 */
public class ATM {
    public static void main(String[] args) {
        //卡号
        int cardNumber = 20191202;
        //密码
        int password = 123456;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入卡号:");
            int number = scanner.nextInt();
            System.out.println("请输入密码:");
            int word = scanner.nextInt();
            if (number == cardNumber && word == password) {
                System.out.println("come in");
                break;
            } else {
                if (i == 2) {
                    System.out.println("today is more,please next!");
                    return;
                } else {
                    System.out.println("输入错误，请重新输入");
                    System.out.println();
                    continue;
                }
            }
        }
        //定义初始等级
        int grade = 1;
        System.out.println("请输入强化次数:");
        int frequency = scanner.nextInt();
        while(frequency > 0){
            boolean isFlag = upgrade(grade);
            if(isFlag == true){
                grade++;
            }else if(grade >= 4 && grade <= 7){
                grade--;
            }else if(grade >= 8 && grade <= 10){
                grade-=3;
            }else if(grade > 10){
                grade = 0;
            }
            if(grade == 0){
                System.out.println("装备已爆");
                return;
            }else{
                System.out.println("强化结果为:"+grade);
            }
        }
    }

    public static boolean upgrade(int grade) {
        double v = Math.random() * 100 + 1;
        if (grade <= 3) {
            return true;
        } else if (grade <= 4 && v <= 95) {
            return true;
        } else if (grade <= 5 && v <= 90) {
            return true;
        } else if (grade <= 6 && v <= 80) {
            return true;
        } else if (grade <= 7 && v <= 75) {
            return true;
        } else if (grade <= 8 && v <= 62.1) {
            return true;
        } else if (grade <= 9 && v <= 53.7) {
            return true;
        } else if (grade <= 10 && v <= 41.4) {
            return true;
        } else if (grade <= 11 && v <= 33.9) {
            return true;
        } else if (grade <= 12 && v <= 28) {
            return true;
        }else if(grade <= 13 && v < 20.7){
            return true;
        }else if(grade <= 14 && v < 17.3){
            return true;
        }else if (grade <= 15 && v < 13.6){
            return true;
        }else if(grade <= 16 &&  v < 10.1){
            return true;
        }
        return false;
    }
}