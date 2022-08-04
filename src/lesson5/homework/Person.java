package lesson5.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 17:59
 * @Description: 1、按要求编写Java应用程序。
 * （1）创建一个叫做People的类：
 * 属性：姓名、年龄、性别、身高
 * 行为：说话、计算加法、改名
 * 编写能为所有属性赋值的构造方法；
 **/
public class Person {

    String name;
    int age;
    String sex;
    double height;

    public Person() {
    }

    public Person(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    // 输入要说的话
    public void speek(String language) {
        System.out.println(language);
    }

    // 计算x和y的和
    public int addition(int x, int y) {
        return x + y;
    }

    //更改姓名
    public void setName(String name) {
        this.name = name;
    }
}