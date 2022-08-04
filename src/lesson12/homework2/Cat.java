package lesson12.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:06
 * @Description:
 */

public class Cat extends Aniaml {

    public Cat() {
    }

    public Cat(String kid) {
        super(kid);
    }

    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
}