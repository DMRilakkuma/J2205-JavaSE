package lesson6;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 09:29
 * @Description:
 */
public class Person {
    private String name;  // 默认值为null
    private char sex; //默认值为空格
    private int age; // 默认值为0, 整数(byte,short,int,long)的默认值都是0;
    private double height; // 默认值为0.0
    private float weight; // 默认值为 0.0


    // 每个类对象都有构造方法，如果你没有自定义构造方法，java会默认给每一个类创建一个最基础的无参构造方法
    // 如果你自定义了构造方法，那么java就不会再给你创建无参构造
    // 无参构造: 没有构造方法
    public Person() {

    }

    // 有参构造在创建对象时,将该对象中一些基础属性进行初始化,赋值
    public Person(String name, char sex, int age, double height, float weight) { // 形参
        // 将Person对象中的属性，赋值等于该构造方法传过来的值
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }



    // 写在类的内部属性(变量),这些变量和方法是同一级的，这些变量叫做:全局变量
    // 所谓的全局变量作用范围内部，任何地方都可以随意使用，在类对象被实列化时，如果类变量没有给初始值，Java会给出默认值
    // 引用数据类型
    int[] array; //

    public void speek() {
        // 局部变量，也叫临时变量
        // 临时变量:因为该变量在当前方法使用结束后，就自动被回收销毁了
        // 在方法中使用变量，如果局部变量和全局变量，名称相同，那么首先使用的是局部变量
        // 局部变量首先被使用的原因:就近原则
        String interest = "唱歌,跳舞,和运动";
        System.out.println("我是" + name + ",我的年龄是" + this.age + ",我是兴趣爱好是" + interest);
    }

}