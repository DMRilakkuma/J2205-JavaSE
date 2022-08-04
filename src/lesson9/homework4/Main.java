package lesson9.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:25
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("玛莎拉蒂","绿");
        Truck truck = new Truck("宝马","黄",3);
        Car car = new Car("奔驰","绿",8);
        vehicles.showinfo();
        truck.showTruck();
        car.showCar();
    }
}