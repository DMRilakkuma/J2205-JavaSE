package lesson12.studyabstract;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:14
 * @Description: 测试
 */

public class test {
    public static void main(String[] args) {
        Student student = new Student();
        student.play("张三");

        // 第一种:如果抽象类要实例化，必须实现抽象类里面的所有方法
        People people = new People() {
            @Override
            public void play(String name) {

            }

            @Override
            public void eat() {

            }
        };
        // 第二种:因为子类继承了父类，那么就可以使用向上转型的方法，将父类的创建引入子类的对象
        People people1 = new Student();
        people1.run();
        people1.eat();
        People people2 = new LittleStudent();
        people2.eat();
    }
}