package lesson12.studyabstract;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:01
 * @Description: 学生类
 */

public class Student extends People {
    // 如果父类中有抽象方法，子类必须重写父类的抽象方法
    @Override
    public void play(String name) {
        System.out.println("学生会玩电脑和手机游戏");
    }

    @Override
    public void eat() {
        System.out.println("学生喜欢吃麦当劳");
    }


}