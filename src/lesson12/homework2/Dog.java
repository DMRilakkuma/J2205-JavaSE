package lesson12.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:06
 * @Description:
 */

public class Dog extends Aniaml {
    public Dog() {
    }

    public Dog(String kid) {
        super(kid);
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
}