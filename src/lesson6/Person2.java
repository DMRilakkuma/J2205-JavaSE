package lesson6;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 14:34
 * @Description:
 */
public class Person2 {

    private String name = "张三";
    private char sex;
    private int age;
    private double height;
    private float weight;

    public Person2() {
        System.out.println("你访问了无参构造");
    }

    public Person2(String name, char sex, int age, double height, float weight) {
        this();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 4) {
            this.name = name;
        } else {
            System.out.println("你设置的名字长度过长");
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}