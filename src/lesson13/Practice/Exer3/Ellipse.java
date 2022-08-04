package lesson13.Practice.Exer3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 16:58
 * @Description:
 */

public class Ellipse extends Graph {

    // 长半抽
    private int majorSemiAxis;

    // 短半轴
    private int shortHalfShaft;


    @Override
    public void area() {
        System.out.println("椭圆的面积:" + Math.PI * majorSemiAxis * shortHalfShaft);
    }
}