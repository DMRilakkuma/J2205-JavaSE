package lesson13.Practice.Exer5;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 17:18
 * @Description:
 */

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("自行车启动");
    }

    @Override
    public void stop() {
        System.out.println("自行车停止");
    }
}