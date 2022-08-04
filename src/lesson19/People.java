package lesson19;

public interface People {
    int speak(int a, int b, int c);


    // 接口当中的方法发生了变化，那么跟这个接口相关的子类就都得变
    // 这样的话就提高的耦合度(类与类之间的粘粘度)
    // 为了避免这样的情况发生，在已经完成的接口中可以添加default方法
    // 添加默认方法时,子类就可以选择性的去重写这个默认方法
    default void eat() {
        System.out.println("我喜欢水果");
    }
}
