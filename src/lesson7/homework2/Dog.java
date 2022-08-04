package lesson7.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:34
 * @Description:
 */
public class Dog extends Cat {
    public Dog() {
    }

    public Dog(String hairColor, int numberOfLegs) {
        super(hairColor, numberOfLegs);
    }

    // 狗特有行为
    public void lookHome() {
        System.out.println("看家");
    }

    @Override
    public void math(int a) {


    }

}