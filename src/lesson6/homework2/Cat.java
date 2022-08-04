package lesson6.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 15:58
 * @Description:
 */
public class Cat {
    private String name;
    private double weight;

    public Cat() {
    }

    public Cat(String name, double weight) {
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

    public void catched(Mouse m) {
        System.out.println("抓到老鼠");
        this.weight += m.getWeight() * 0.5;
    }
}