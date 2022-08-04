package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 16:04
 * @Description:
 */
public class Animal {
    String name; // 名字
    String sex; // 性别
    double weight; // 体重
    double age; // 年龄
    String leg; // 腿
    String furColor; // 毛发颜色

    public Animal() {
        System.out.println("你创建了动物");
    }

    public Animal(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("擅长奔跑");
    }

    public void scare() {
        System.out.println("能发出叫声");
    }

    public void breakHouse() {
        System.out.println("拆机小能手");
    }
}