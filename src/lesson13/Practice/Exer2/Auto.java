package lesson13.Practice.Exer2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:43
 * @Description:
 */

public class Auto {

    // 轮胎个数
    private int number;

    // 汽车颜色
    private String color;

    // 汽车重量
    private int weight;

    // 速度
    private int speed;

    public Auto() {
    }

    public Auto(int number, String color, int weight, int speed) {
        this.number = number;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }

    public void speedUp() {
        /*
         * @author MC
         * @description //TODO 汽车加速
         * @createTime  2022-07-12 16:48
         * @param speedUp
         * @return void
         **/

        System.out.println("汽车加速");
    }

    public void slowDown() {
        /*
         * @author MC
         * @description //TODO 汽车减速
         * @createTime  2022-07-12 16:48
         * @param slowDown
         * @return void
         **/

        System.out.println("汽车减速");
    }

    public void parking() {
        /*
         * @author MC
         * @description //TODO 停车
         * @createTime  2022-07-12 16:49
         * @param parking
         * @return void
         **/

        System.out.println("汽车停车");
    }

}