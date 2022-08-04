package lesson14;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 14:21
 * @Description:
 */

public class AccountA {
    private double money;

    public AccountA() {
    }

    public AccountA(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }
}