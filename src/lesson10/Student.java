package lesson10;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 16:12
 * @Description:
 */

public class Student {
    static String name;
    String sex;

    public Student() {
        System.out.println("你创建了当前这里的Student类");
    }

    static { // 没有被定义的方法，匿名方法
        System.out.println("你调用了当前的游离块");
    }

    {
        System.out.println("子类的游离块");
    }

    public Student(String name, String sex) {
        this.sex = sex;
    }

    static public void run() {
        System.out.println("我删除跑步");
    }

    public void speak() {
        System.out.println("我会说英语");
    }
}