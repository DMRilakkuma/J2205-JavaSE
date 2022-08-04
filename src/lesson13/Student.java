package lesson13;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 11:19
 * @Description:
 */

public class Student extends People {
    public static void main(String[] args) {
        Student student = new Student();
        String password = student.new Person().password;
        System.out.println(password);
        student.new Person().print();
    }
}