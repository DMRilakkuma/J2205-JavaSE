package Exam2.exer29;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:53
 * @Description:
 */

public class StudentTest {
    public static void main(String[] args) {
        PerformanceManagement performanceManagement = new PerformanceManagement();
        performanceManagement.addStudent(new Student("2019", "张三", 89, 79, 90));
        performanceManagement.addStudent(new Student("2010", "李四", 78, 67, 103));
        performanceManagement.addStudent(new Student("2011", "王五", 57, 46, 130));
        performanceManagement.showStudent();
        System.out.println();
        performanceManagement.removeStudent("2010");
        performanceManagement.showStudent();


    }
}