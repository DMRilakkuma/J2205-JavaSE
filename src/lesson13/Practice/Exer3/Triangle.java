package lesson13.Practice.Exer3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:57
 * @Description:
 */

public class Triangle extends Graph {

    // 底
    private int low;

    // 高
    private int high;

    @Override
    public void area() {
        System.out.println("三角行面积为：" + low * high / 2);
    }
}