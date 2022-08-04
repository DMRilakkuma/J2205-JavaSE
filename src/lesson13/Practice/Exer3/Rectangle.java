package lesson13.Practice.Exer3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:57
 * @Description: 矩形
 */

public class Rectangle extends Graph {

    // 长
    private int lasting;

    // 宽
    private int wide;

    @Override
    public void area() {
        System.out.println("矩形面积为:" + lasting * wide);
    }


}