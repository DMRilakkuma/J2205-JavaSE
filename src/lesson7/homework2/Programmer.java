package lesson7.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:14
 * @Description:
 */
public class Programmer {
    // 姓名
    private String name;
    // 工号
    private String jobNumber;
    // 工资
    private int wage;

    public Programmer() {
    }

    public Programmer(String name, String jobNumber, int wage) {
        this.name = name;
        this.jobNumber = jobNumber;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void work() {
        System.out.println("姓名" + this.getName() + "工号" + this.getName()+"工资:"+this.getWage());
    }
}