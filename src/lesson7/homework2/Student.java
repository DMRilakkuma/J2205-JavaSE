package lesson7.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:20
 * @Description:
 */
public class Student {
    // 姓名
    private String name;
    // 年龄
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void eat() {
        System.out.println("我要吃饭");
    }

    public void work() {
        System.out.println("学生要学习");
    }

}