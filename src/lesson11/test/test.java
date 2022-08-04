package lesson11.test;

import java.io.IOException;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 10:42
 * @Description:
 */

public class test {
    public static void main(String[] args) throws IOException {
//        Student student = Student.getStudent();
//        Student student2 = Student.getStudent();
//        Student student3 = Student.getStudent();
//        System.out.println(student.hashCode());
//        System.out.println(student2.hashCode());
//        System.out.println(student3.hashCode());

        // 饿汉模式
        Runtime runtime = Runtime.getRuntime();
        long l = runtime.freeMemory();
        System.out.println(l / (1024 * 1024) + "M");
//        runtime.exec("shutdown -s -t 300");
        runtime.exec("");
    }
}