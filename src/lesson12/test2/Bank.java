package lesson12.test2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 14:49
 * @Description:
 */

public abstract class Bank {
    // 本金
    private double money; // 本金

    // 利息
    private double interest; // 利息

    public Bank() {
    }

    public Bank(double money, double interest) {
        this.money = money;
        this.interest = interest;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = this.interest;
    }

    // 计算账号下的利率
    public abstract double getInterestRate();


}