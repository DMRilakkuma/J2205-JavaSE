package Exam4.Exer60;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 10:08
 * @Description:
 */

public class Dog {
    private String name;

    private String variety;

    private int healthValue;

    public Dog() {
    }

    public Dog(String name, String variety, int healthValue) {
        this.name = name;
        this.variety = variety;
        this.healthValue = healthValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", healthValue='" + healthValue + '\'' +
                '}';
    }
}