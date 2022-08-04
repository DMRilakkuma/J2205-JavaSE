package lesson14;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 11:05
 * @Description:
 */

public class Student extends People {
    @Override
    public void eat() throws myException {
        //子类在继承父类后，重写父类方法
        // 如果父类有抛出异常,子类的异常其实由父类异常直接抛出使用
        
    }
}