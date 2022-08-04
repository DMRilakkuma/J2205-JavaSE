package lesson9;

import lesson9.up.People;
import lesson9.up.Student;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 09:34
 * @Description:
 */

public class test {
    public static void main(String[] args) {
//        People people1 = new People();
        String string = new String("a");

        People people2 = new Student(); // 向上转型

        // 因为当前Student是继承了people,那么创建Student()的时候,其实也调用people对象
//        System.out.println(people2.name);
//        people2.speak();
        Object object = new Object();
        People people = new People();
        if (people2 instanceof Student) {
            Student student = (Student) people2;
        }

    }
}