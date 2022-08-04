package lesson9.up;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 09:32
 * @Description:
 */
public class Student extends People {
    int number;
    int address;
    String name;

    public Student() {
        System.out.println("我是子类构造");
    }

    public void speak() {
        System.out.println("我会说英语,日语,英语");
    }

    public static void run() {
        System.out.println("我会长跑");
    }

}