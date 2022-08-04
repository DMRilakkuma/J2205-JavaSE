package lesson7.homework3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 19:06
 * @Description:
 */
public class StudengTest {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        // 页面管理
        Loop:
        while (true) {
            System.out.println("--------------学生管理系统------------------");
            System.out.println("--------------1.单个学生成绩的录入------------");
            System.out.println("--------------2.显示所有学员信息-------------");
            System.out.println("--------------3.删除学生--------------------");
            System.out.println("--------------4.统计学生三门课总分------------");
            System.out.println("--------------5.统计学生三门课平均分- ---------");
            System.out.println("--------------6.退出------------------------");
            System.out.println();
            System.out.print("请选择你需要的功能: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    studentManagement.input();
                    break;
                case 2:
                    studentManagement.showStudent();
                    break;
                case 3:
                    System.out.print("请输入你需要删除学生学号:");
                    int studentId = scanner.nextInt();
                    studentManagement.deleteStudent(studentId);
                    break;
                case 4:
                    System.out.print("请输入你需要统计总分学生学号:");
                    int studentId2 = scanner.nextInt();
                    int totalScore = studentManagement.totalScore(studentId2);
                    if (totalScore < 0) {
                        System.out.println("没有找到该学生");
                    } else {
                        System.out.println("该学生的总分为" + totalScore);
                    }
                    break;
                case 5:
                    System.out.println("请输入你需要统计平均分学生学号:");
                    int studentId3 = scanner.nextInt();
                    int theAverageScore = studentManagement.theAverageScore(studentId3);
                    if (theAverageScore < 0) {
                        System.out.println("没有找到该学生");
                    } else {
                        System.out.println("该学生的平均分为" + theAverageScore);
                    }
                    break;
                case 6:
                    break Loop;
                default:
                    System.out.println("没有此选项,请重新输入");
            }
        }

        System.out.println("退出成功,谢谢使用");
    }
}