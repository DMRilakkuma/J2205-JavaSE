package lesson11.test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 11:11
 * @Description: 饿汉模式：goods类一加载的时候就创建
 */


public class Goods {
    static Goods goods = new Goods();

    private Goods() {

    }

    // 提供一个供外部访问的方法,这个作用是给外部访问的一个Goods对象
    public static Goods getGoods() {
        return goods;
    }
}