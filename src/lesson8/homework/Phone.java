package lesson8.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 17:03
 * @Description: // 定义一个手机类Phone，包含三个属性品牌(brand)、价格(price)、颜色(color)。
 *
 */
public class Phone {
    // 品牌
    private String brand;
    // 价格
    private int price;
    // 颜色
    private String color;

    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}