package lesson7.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:28
 * @Description:
 */
public class Teacher extends Student {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("老师要讲课");
    }
}