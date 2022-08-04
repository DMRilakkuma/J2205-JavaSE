package lesson13.Practice.Exer5;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 17:21
 * @Description:
 */

public class interfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bus bus = new Bus();
        bike.start();
        bike.stop();

        bus.start();
        bus.stop();
    }
}