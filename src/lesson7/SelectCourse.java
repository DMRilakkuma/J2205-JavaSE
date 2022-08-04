package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 15:00
 * @Description:
 */

public class SelectCourse {
    private Course course; // 把课程类作为选课类的一个属性;
    private Student student;

    public void show() {
        // 打印一个学生的信息和学生所选的课程信息
        System.out.println("学生的姓名是" + student.getName());

        // 打印课程信息
        System.out.println("学生选择的课程"+course.getcName());
    }
}