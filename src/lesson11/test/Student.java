package lesson11.test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 09:18
 * @Description:
 */
// 懒汉模式，需要被使用的时候才会被创建，而且只会创建一次
public class Student { // 要用的时候才创建对象，但是这个对象只会创建一次

    static Student student; //类内部的对象，这个对象就是当前这个类，不让外部随意调用

    // 单列模式:只存在一个实列化对象，需要使用是直接从该对象中取到即可
    private Student() {

    }

    // 通过自定义一个方法来调用内部私有构造，将实列化的过程交给该类自己处理，不该外部随意实列化
    // 懒汉模式是不安全线程，所义会出现数据不同步的问题，为了解决这个问题，就需要给懒汉加上同步锁
    // synchronized:是Java中最简单的一个锁，目的是保证一个对象中的数据同步
    public static synchronized Student getStudent() {
        if (student == null) {
            // 如果当前student对象为null时再去调用Student类的实例化创建对象
            student = new Student();
        }
        return student;
    }
}