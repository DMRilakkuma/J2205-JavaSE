package lesson20.Exer;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 14:54
 * @Description:
 */

public class Dog extends Animal {
    public String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void cry() {
        System.out.println("狗跑");
    }
}