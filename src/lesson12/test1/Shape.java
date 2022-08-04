package lesson12.test1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:31
 * @Description: 形状
 */

public abstract class Shape {
    // 因为求一个图像的周长和面积是最基本的数学运费要求,所以这两个方法为抽象方法
    // 求周长的抽象方法
    public abstract void perimeter();

    // 求面积的抽象方法
    public abstract void area();
}