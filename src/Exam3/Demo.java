package Exam3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 09:16
 * @Description:
 */

public class Demo {
    public void func() {
        new Inner();
    }

    class Inner {
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.new Inner();
    }

    public void eat() {

    }
}


