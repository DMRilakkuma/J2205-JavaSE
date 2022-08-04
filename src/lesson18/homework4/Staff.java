package lesson18.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 17:04
 * @Description:
 */

public class Staff implements Comparable<Staff> {
    private String number;
    private String name;
    private float wage;

    public Staff() {
    }

    public Staff(String number, String name, float wage) {
        this.number = number;
        this.name = name;
        this.wage = wage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }


    @Override
    public int compareTo(Staff o) {
        return (int) -(this.wage - o.wage);
    }
}