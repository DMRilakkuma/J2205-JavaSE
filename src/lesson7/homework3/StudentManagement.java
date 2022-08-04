package lesson7.homework3;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:42
 * @Description:
 */
public class StudentManagement {
    // 学生数组(假设最多有100个学生)
    private Student[] students = new Student[100];
    // 记录已经录入学生的数量
    int count = 0;

    public StudentManagement() {
    }

    public StudentManagement(Student[] students, int count) {
        this.students = students;
        this.count = count;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // 学生信息的录入
    public void input() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        // 输入学生信息
        System.out.print("请输入学生的学号:");
        int studentID = scanner.nextInt();
        System.out.print("请输入学生姓名:");
        String name = scanner.next();
        System.out.print("请输入学生的数学成绩:");
        int mathScores = scanner.nextInt();
        System.out.print("请输入学生的英语成绩:");
        int englishScores = scanner.nextInt();
        System.out.print("请输入学生的语文成绩:");
        int chineseScorea = scanner.nextInt();
        // 修改学生信息
        student.setStudentID(studentID);
        student.setName(name);
        student.setMathScores(mathScores);
        student.setEnglishScores(englishScores);
        student.setChineseScore(chineseScorea);
        students[count++] = student;
    }

    // 显示所有学生信息
    public void showStudent() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].toString());
        }
    }

    //删除学生
    public void deleteStudent(int studentID) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentID() == studentID) {
                // 将后面的学生往前移位
                for (int j = i + 1; j < count; j++) {
                    students[j - 1] = students[j];
                }
                count--;
                System.out.println();
                break;
            }
        }
    }

    // 统计某个学生的三门课总分
    public int totalScore(int studentID) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentID() == studentID) {
                return students[i].getMathScores() + students[i].getChineseScore() + students[i].getEnglishScores();
            }
        }
        return -1;
    }

    // 统计某个学生三门课的平均分
    public int theAverageScore(int studentID) {
        return this.totalScore(studentID) / 3;
    }

}