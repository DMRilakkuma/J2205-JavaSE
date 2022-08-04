package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 16:13
 * @Description:
 */
public class Cat extends Animal {
    String eye; // 眼睛好看

    public Cat() {
        System.out.println("你创建猫");
    }

    public void eatMouse() {
        System.out.println("猫吃老鼠");
    }

    public void cilmbTree() {
        System.out.println("能爬树");
    }

    @Override
    public void run() {
        System.out.println("猫是两条腿奔跑");
    }


}