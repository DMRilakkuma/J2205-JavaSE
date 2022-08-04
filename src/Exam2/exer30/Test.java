package Exam2.exer30;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 16:28
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财",78,99,"拉布拉多");
        Penguin penguin = new Penguin("小七",67,89,"公");
        Host host = new Host();

        System.out.println(dog.healthValue);
        host.feeding(dog);
        System.out.println(dog.healthValue);

        System.out.println(penguin.healthValue);
        host.feeding(penguin);
        System.out.println(penguin.healthValue);
    }
}