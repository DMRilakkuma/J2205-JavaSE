package lesson13.Practice.Exer6;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 17:56
 * @Description:
 */

public class PasswordDoor extends Door implements Protect {
    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }

    @Override
    public void theftproof() {
        System.out.println("防盗");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }

    @Override
    public void bulletproof() {
        System.out.println("防弹");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }
}