package lesson11.test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 09:20
 * @Description:
 */


public class HelloB extends HelloA {
    public HelloB() {
        System.out.println("B构造方法");
    }

    {
        System.out.println("I’m B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}

class HelloA {
    public HelloA() {
        System.out.println("A构造方法");
    }

    {
        System.out.println("I’m A class");
    }

    static {
        System.out.println("static A");
    }
}
