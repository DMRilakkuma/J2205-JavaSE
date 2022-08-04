package lesson9.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:23
 * @Description:
 */

public class Truck extends Vehicles {
    private float load;

    public Truck() {
    }

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck() {
        System.out.println("Truck{" +
                "load=" + load +
                '}');
    }


}