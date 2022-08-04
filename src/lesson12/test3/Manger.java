package lesson12.test3;

// 接口类也是抽象类的一种
// 接口类里面都是一些抽象的功能
public interface Manger {
    // 常量
    int size = 12;

    // 在接口类中的方法默认是抽象的,所以不能有方法体
    void add();

    void update();

    void insert();

    void delete();

    // 接口中能不能写有方法体的方法
    // 子类可以选择性的重写接口类的方法
    default void getName() {

    }

}
