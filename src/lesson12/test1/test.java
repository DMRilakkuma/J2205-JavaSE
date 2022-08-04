package lesson12.test1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:45
 * @Description:
 */

public class test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 10);
        rectangle.perimeter();
        rectangle.area();

        Round round = new Round(3);
        round.perimeter();
        round.area();
    }
}