package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 15:47
 * @Description:
 */

public class Childen extends Father {
    public void exHua() {
        System.out.println("继承父亲的花呗为:" + huabei);
    }

    // 子类继承了父类的同时,也继承了父类的方法,但是可以在父类方法的基础上有子类自己的逻辑
    @Override
    /*这个叫:注解
    这个注解的作用是：子类在重写父类方法的时候，为了保证和父类方法保持一致，避免重新的时候
    出现错误的作用
     */

    public void carpenter() { // 子类将父类的方法:重写
        System.out.println("我又学习了一个新的木匠技术");
    }

    public static void main(String[] args) {
        Childen childen = new Childen();
        childen.exHua();
        childen.carpenter();
    }

}