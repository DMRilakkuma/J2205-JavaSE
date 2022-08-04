package lesson12.test2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 15:44
 * @Description: 活期类
 */

public class Current extends Bank {

    private int month;
    private double base;

    public Current() {
    }

    public Current(int month, double base) {
        this.month = month;
        this.base = base;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //计算账号下的利息
    @Override
    public double getInterestRate() {
        return month * base * super.getMoney();
    }

}