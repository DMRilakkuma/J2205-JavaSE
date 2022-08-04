package lesson12.test1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:41
 * @Description: 圆形
 */

public class Round extends Shape {
    private double r;

    public Round() {
    }

    public Round(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void perimeter() {
        // 圆形的周长
        double girth = 2 * Math.PI * r;
        System.out.println("圆的周长是" + girth);
    }

    @Override
    public void area() {
        // 圆的面积
        double acreage = Math.PI * Math.pow(r, 2);
        System.out.println("圆形的面积是:" + acreage);

    }
}