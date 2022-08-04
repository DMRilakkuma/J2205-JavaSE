package lesson12.test3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 13:58
 * @Description: 人的类
 */

public abstract class People {
    String name;
    public String age;

    public People() {
    }

    public void run() {
        System.out.println("人会跑动");
    }

    // 被abstract修饰的方法，叫做抽象方法
    // 作用是,让每个子类都重新这个抽象方法，这样一来每个子类中的该方法
    // 就有不同的展示方式
    public abstract void play(String name);

    public abstract void eat();

}