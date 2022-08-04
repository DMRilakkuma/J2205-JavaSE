package lesson20.fanshe;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 09:32
 * @Description:
 */

public class Student {

    String test1;

    protected String test2;

    private final static String test3 = "";

    public String name;

    public int age;

    private char sex;

    private double height;

    public Student() {
    }

    public Student(String name, int age, char sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                '}';
    }

    private void eat() {
        System.out.println("我喜欢吃热干面");
    }

    public void showCore(String kemu, int core) {
        System.out.println(this.name + "的" + kemu + "的成绩是" + core);
    }


}