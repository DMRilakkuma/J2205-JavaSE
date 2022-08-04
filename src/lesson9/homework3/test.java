package lesson9.homework3;

import java.util.Scanner;

/**
 * @program: day1
 * @description:
 * @author: DY
 * @create: 2022-07-06 09:01
 **/

public class test {


    public static void main(String[] args) {
        int[][] seats={
                {0,0,0,0,0,1},// 第一行座位
                {0,1,0,0,0,1,0},// 第二行座位
                {0,0,1,0,0,1,0,1},// 第三行座位
                {0,0,0,1,0,1,0,1}// 第四行座位
        };
        int row = -1;// 用户选择的行
        int seat = -1;// 用户选择的座位
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你要选择的第几排？");
        // 先将当前影院中所有的座位打印给用户选择
        for (int i = 0; i <seats.length ; i++) {// 循环行
            System.out.print("第"+(i+1)+"排：");
            for (int j = 0; j <seats[i].length ; j++) {// 循环每一行里面的内容
                System.out.print(seats[i][j]+"\t");
            }
            System.out.println();
        }
        row = scanner.nextInt();// 获取用户输入的行
        if (row>seats.length){
            System.out.println("你选择的排不对！");
            return;//结束这个main方法
        }else {
            System.out.println("请输入你要选择的排的座位座位");
            seat = scanner.nextInt();// 用户选择当前排的座位
            // 判断当前用户的选择座位是否为可选
            // 用户输入的数字跟当前数组匹配时，需要-1，因为数组是从0开始定位
            int[] nowSeat = seats[row-1];// 对应行的座位数组
            int useSeat = nowSeat[seat-1];
            if (useSeat==0){
                System.out.println("选座成功");
                // 选择坐成功将当前座位值改为1
                seats[row-1][seat-1]=1;
                // 再将座位数组打印一遍
                for (int i = 0; i <seats.length ; i++) {// 循环行
                    System.out.print("第"+(i+1)+"排：");
                    for (int j = 0; j <seats[i].length ; j++) {// 循环每一行里面的内容
                        System.out.print(seats[i][j]+"\t");
                    }
                    System.out.println();
                }
            }else {
                System.out.println("你选择的座位已经被售出，请重新选择");
            }
        }
    }
}
