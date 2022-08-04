package lesson12.test2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 15:49
 * @Description:
 */

public class FixADate extends Bank {
    private int year;
    private int base;

    public FixADate() {
    }

    public FixADate(int year, int base) {
        super();
        this.year = year;
        this.base = base;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getInterestRate() {
        return year * base * 1.2 * super.getMoney();
    }
}