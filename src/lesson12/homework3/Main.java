package lesson12.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 18:28
 * @Description:
 */

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Cola cola = new Cola();
        MineralWater mineralWater = new MineralWater();
        coffee.select();
        cola.select();
        mineralWater.select();
    }
}