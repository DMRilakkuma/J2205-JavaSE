package lesson13.Practice.Exer3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:57
 * @Description:
 */

public class Round extends Graph {
    // 半经
    private int r;

    @Override
    public void area() {
        System.out.println("圆形的面积为：" + Math.PI * Math.pow(r, 2));
    }
}