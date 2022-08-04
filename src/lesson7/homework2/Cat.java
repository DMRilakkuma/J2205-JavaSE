package lesson7.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:31
 * @Description:
 */
public class Cat {
    // 头发颜色
    private String hairColor;
    // 腿的个数
    private int numberOfLegs;

    public Cat() {
    }

    public Cat(String hairColor, int numberOfLegs) {
        this.hairColor = hairColor;
        this.numberOfLegs = numberOfLegs;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    //吃
    public void eat() {
        System.out.println("我要吃饭");
    }

    // 猫的独有行为
    public void catchMouse() {
        System.out.println("猫要抓老鼠");
    }

    public void math(int a) {

    }

}