package lesson14;

import lesson13.Student;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Timer;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 09:08
 * @Description:
 */

public class test {
    Timer timer;
    Student student;

    public void setStudent() {
        student = new Student();
    }

    public Student getStudent() {
        return student;
    }

    public static void main(String[] args) {
        System.out.println("执行前");
        System.out.println(1 / 0);
        System.out.println("执行后");
    }

    @Test
    public void test() {
        System.out.println("调用了这个类");
        // 关于不同级别的提示
        System.err.println("这是一个错误提示");
//        info debugg err log
    }

    @Test
    public void test2() {
        int a = 1;
        int b = 2;
        // 做b除a
        if (a != 0) {
            System.out.println(b / a);
        } else {
            System.out.println("被除数为0,不能做除法");
        }
    }

    @Test
    public void test3() {
        test test = new test();
        test.getStudent();

    }

    @Test
    public void test4() {
        int[] ints = new int[5];
        if (6 > ints.length) {
            System.out.println("你输入的地址不合法");
        } else {
            System.out.println(ints[6]);
        }
    }

    @Test
    public void test5() {
//        Integer integer = java.lang.Integer.valueOf("abc");
        String abc = (String) new Object();

    }


    @Test
    public void test6() throws Exception {
        Class.forName("");
        File file = new File("");
        new FileInputStream(file);

        Connection connection = null;
        Statement statement = connection.createStatement();

    }
}