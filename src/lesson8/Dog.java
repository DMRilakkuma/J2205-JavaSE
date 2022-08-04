package lesson8;

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

    // 重载时,返回值可以不一样
    public void Dog() {

    }

    // 重载,方法的参数列表可以不一样，甚至参数列表中的参数类型以及参数的数量都可以不一样
    //重载时,方法的参数列表可以不一样;
    public int Dog(String name) {
        return 0;
    }

    public int Dog(int number) {
        return 0;
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

    @Override
    public String toString() {
        System.out.println("当前类的包名" + getClass().getPackage());
        System.out.println("当前类的类名" + getClass().getName());
        System.out.println("当前类的hashCode" + Integer.toHexString(hashCode()));
        return null;
    }
}