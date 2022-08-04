package lesson12.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:09
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Aniaml[] aniaml = new Aniaml[5];
        for (int i = 0; i < aniaml.length; i++) {
            int v = (int) (Math.random() * (2 + 1));
            if (v == 0) {
                aniaml[i] = new Cat("猫");
            } else if (v == 1) {
                aniaml[i] = new Dog("狗");
            } else {
                aniaml[i] = new Sheep("小羊");
            }
        }
        for (Aniaml a : aniaml) {
            a.cry();
        }
    }
}