package Exam4.Exer62;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-22 10:26
 * @Description:
 */

public class Worker {
    private String name;

    private int age;

    private double wage;

    public Worker() {
    }

    public Worker(String name, int age, double wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wage=" + wage +
                '}';
    }
}