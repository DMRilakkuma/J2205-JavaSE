package lesson6.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 16:01
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Mouse m = new Mouse("Tom", 120);
        Cat c = new Cat("JieNi", 35);
        while (true) {
            if (c.getWeight() < m.getWeight() * 5) {
                c.catched(m);
            } else {
                m.run();
                break;
            }
        }
    }
}
