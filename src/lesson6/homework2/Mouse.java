package lesson6.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 15:57
 * @Description:
 */
public class Mouse {
    private String name;
    private double weight;


    public Mouse() {
    }

    public Mouse(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void run() {
        System.out.println("老鼠跑掉了");
        this.haha();
    }

    public void haha() {
        System.out.println("你真垃圾");
    }
}