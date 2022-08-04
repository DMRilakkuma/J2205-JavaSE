package lesson8;

import lesson7.Car2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 15:40
 * @Description:
 */

// 实体类,去实现一个抽象类
// 如果一个实体类去实现一个抽象类,就像必须将接口中的所有抽象方法重写一遍
// 单继承,多实现
public class Bus implements Car, Car2 {

    // 一个类只能继承一个父类,但是可以实现很多个接口类
    // 如果子类继承了父类,是不是就子类就要把父类中所有方法重写
    // 但是可以实现一个接口类
    // 一个类实现了一个接口类,就必须要将这个接口类的所有抽象方法都实现一遍
    @Override
    public void getName(String name) {

    }
}