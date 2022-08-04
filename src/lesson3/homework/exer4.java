package lesson3.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 16:23
 * @Description:
 */
public class exer4 {
    public static void main(String[] args) {
        //4、	随机一个100到200之间的整数x，然后再让用户输入一个10以内的整数y，判断x是否是y的倍数。
        int x = (int) Math.round(Math.random() * 100 + 100);
        int y = (int) Math.round(Math.random() * 10);
        if (x % y == 0) {
            System.out.println("x是y的倍数");
        } else {
            System.out.println("x不是y的倍数");
        }
    }
}