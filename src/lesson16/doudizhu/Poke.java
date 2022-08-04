package lesson16.doudizhu;

/**
 * @program: day1
 * @description:
 * @author: DY
 * @create: 2022-07-15 16:45
 **/

public class Poke {
    // 牌的编号
    private String number;
    // 花色:黑桃，红桃，方块和梅花
    private String color;

    public Poke() {
    }

    public Poke(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Poke{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
