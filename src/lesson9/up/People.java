package lesson9.up;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 09:30
 * @Description:
 */
public class People {
    public String name;
    public String sex;

    public People() {
//        this.name = "人类";
//        this.sex = "男";
        System.out.println("我是父类构造");
    }

    public People(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void speak() {
        System.out.println("父类在说话");
    }

}