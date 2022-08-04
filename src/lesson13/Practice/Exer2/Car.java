package lesson13.Practice.Exer2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:49
 * @Description:
 */

public class Car extends Auto {
    // 空调
    private String airConditioning;

    // CD
    private String CD;

    public Car() {
    }

    public Car(int number, String color, int weight, int speed, String airConditioning, String CD) {
        super(number, color, weight, speed);
        this.airConditioning = airConditioning;
        this.CD = CD;
    }

    public String getAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(String airConditioning) {
        this.airConditioning = airConditioning;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    @Override
    public String toString() {
        return "Car{" +
                "airConditioning='" + airConditioning + '\'' +
                ", CD='" + CD + '\'' +
                '}';
    }

    @Override
    public void speedUp() {
        System.out.println("小汽车加速");
    }

    @Override
    public void slowDown() {
        System.out.println("小汽车减速");
    }

    @Override
    public void parking() {
        System.out.println("小汽车停车");
    }
}