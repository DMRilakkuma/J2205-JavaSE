package lesson9.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:17
 * @Description:
 */

public class Vehicles {
    // 商标
    private String brand;
    //颜色
    private String color;

    public Vehicles() {
    }

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public void run() {
        /*
         * @author MC
         * @description //TODO 行驶
         * @createTime  2022-07-05 18:19
         * @param run
         * @return void
         **/

        System.out.println("我已经开动了");
    }

    public void showinfo() {
        /*
         * @author MC
         * @description //TODO 显示信息
         * @createTime  2022-07-05 18:19
         * @param showinfo
         * @return void
         **/

        System.out.println("Vehicles{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}');


    }

}