package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 16:09
 * @Description:
 */
public class Dog extends Animal {
    String smell; // 嗅觉

    public Dog() {
        super();
        System.out.println("你创建了狗");
        super.scare();

    }

    public void protrctHouse() {
        System.out.println("能看家,守门");
    }

    public void swimm() {
        System.out.println("会游泳");
    }

    @Override
    public void run() {
        System.out.println("狗狗跑步是一条腿支撑，三条腿跑步");
    }
}