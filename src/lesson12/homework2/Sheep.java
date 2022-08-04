package lesson12.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:06
 * @Description:
 */

public class Sheep extends Aniaml {
    public Sheep() {
    }

    public Sheep(String kid) {
        super(kid);
    }

    @Override
    public void cry() {
        System.out.println("咩咩咩");
    }
}