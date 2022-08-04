package lesson12.test1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:36
 * @Description:
 */

public class Rectangle extends Shape {
    double height;
    double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void perimeter() {
        // 矩形的周长
        double girth = (this.height + this.width) * 2;
        System.out.println("当前矩形周长是:" + girth);
    }

    @Override
    public void area() {
        // 矩形的面积
        double acreage = this.width * this.height;
        System.out.println("当前矩形的面积是:" + acreage);
    }
}