package lesson5.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 18:15
 * @Description: 创建一个叫做机动车的类：
 * 属性：车牌号(String)，车速(int)，载重量(double)
 * 功能：加速(车速自增)、减速(车速自减)、修改车牌号，查询车的载重量。
 * 编写两个构造方法：一个没有形参，在方法中将车牌号设置“XX1234”，速
 * 度设置为100，载重量设置为100；另一个能为对象的所有属性赋值；
 */
public class MotorVehicle {
    String numberPlate;
    int speed;
    double loadCapacity;

    public MotorVehicle(String numberPlate, int speed, double loadCapacity) {
        this.numberPlate = numberPlate;
        this.speed = speed;
        this.loadCapacity = loadCapacity;
    }

    public MotorVehicle() {
    }

    public void autoIncrement() {
        speed++;
    }

    public void decrement() {
        speed--;
    }

    @Override
    public String toString() {
        return "MotorVehicle{" +
                "numberPlate='" + numberPlate + '\'' +
                ", speed=" + speed +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}