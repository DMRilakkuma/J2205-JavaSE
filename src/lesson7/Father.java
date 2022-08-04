package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 15:44
 * @Description:
 */


public class Father {
    double money;
    String house;
    String huabei = "-10000";

    private String name;

    public void carpenter() {
        System.out.println("老父亲是一个很厉害的木匠");
        System.out.println("可以做卯榫");
    }

    public Father() {
    }

    public Father(double money, String house, String huabei) {
        this.money = money;
        this.house = house;
        this.huabei = huabei;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHuabei() {
        return huabei;
    }

    public void setHuabei(String huabei) {
        this.huabei = huabei;
    }
}