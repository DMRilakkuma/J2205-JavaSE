package lesson13.Practice.Exer1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:41
 * @Description: 【练习题】static关键字与普通变量的区别:
 * <p>
 * 创建一个名称为StaticDemo的类,并声明一个静态变量和一个普通变量。对变量分别赋予10和5的初始值。在main()方法中输出变量值。
 */

public class StaticDemo {
    static int i = 10;
    int j = 5;
}

class Main {
    public static void main(String[] args) {
        StaticDemo demo = new StaticDemo();
        System.out.println(StaticDemo.i);
        System.out.println(demo.j);
    }
}