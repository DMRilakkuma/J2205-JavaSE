package lesson12.studyabstract;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:12
 * @Description:
 */

public class LittleStudent extends People {
    @Override
    public void play(String name) {
        System.out.println("小学生喜欢玩王者荣耀");
    }

    @Override
    public void eat() {
        System.out.println("小学生喜欢吃金拱门");
    }
}