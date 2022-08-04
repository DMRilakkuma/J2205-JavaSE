package lesson9.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:20
 * @Description:
 */

public class Car extends Vehicles {
    private int seats;

    public Car() {
    }

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public void showCar() {
        /*
         * @author MC
         * @description //TODO 显示小汽车信息
         * @createTime  2022-07-05 18:22
         * @param showCar
         * @return void
         **/

        System.out.println("Car{" +
                "seats=" + seats +
                '}');
    }

}