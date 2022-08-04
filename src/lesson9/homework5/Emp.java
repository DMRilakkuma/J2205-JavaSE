package lesson9.homework5;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:28
 * @Description:
 */

public class Emp {
    // 工号
    private int number;
    // 姓名
    private String name;
    // 性别
    private String sex;
    // 职位
    private String position;
    // 年薪
    private int annualSalary;
    // 月薪
    private int monthlySalary;


    public Emp() {
    }

    public Emp(int number, String name, String sex, String position, int annualSalary, int monthlySalary) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.position = position;
        this.annualSalary = annualSalary;
        this.monthlySalary = monthlySalary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", position='" + position + '\'' +
                ", annualSalary=" + annualSalary +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}