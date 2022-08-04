package lesson19;

import org.testng.annotations.Test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 11:40
 * @Description:
 */

public class test3 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a").append("v").insert(0, "123").append("s");

        Teacher.mytest mytest = new Teacher().new mytest();
        mytest.test();
    }

    @Test
    public void test() {
//        People people1 = () -> {
//            System.out.println("你实现了这个接口的抽象方法");
//        };    +

//        People people = (a) -> System.out.println("你传输的方法是a");
//
//        people.speak(1);

        People people = (a, b, c) -> a + b + c;
        System.out.println(people.speak(1, 2, 3));
    }
}
