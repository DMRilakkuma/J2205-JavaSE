package lesson8.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 17:18
 * @Description: 定义一个员工类Employee，包含三个属性姓名、工号、工资，创建三个员工对象存入ArrayList集合中
 */
public class Employee {
    private String name;
    private int number;
    private int wage;

    public Employee() {
    }

    public Employee(String name, int number, int wage) {
        this.name = name;
        this.number = number;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", wage=" + wage +
                '}';
    }
}