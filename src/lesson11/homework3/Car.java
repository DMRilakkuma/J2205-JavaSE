package lesson11.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 17:28
 * @Description:
 */

public class Car {
    // 轮胎个数
    private int numberOfTires;
    // 汽车颜色
    private String color;
    // 汽车重量
    private int weight;

    public Car() {
    }

    public Car(int numberOfTires, String color, int weight) {
        this.numberOfTires = numberOfTires;
        this.color = color;
        this.weight = weight;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // 加速
    public void speedUp(){
        System.out.println("加速");
    }

    // 减速
    public void slowDown(){
        System.out.println("减速");
    }

    // 停车
    public void parking(){
        System.out.println("停车");
    }
}