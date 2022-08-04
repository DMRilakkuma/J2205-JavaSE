package lesson9.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 17:12
 * @Description: 完成一个企业员工管理系统(EmployeeManagementSystem)，
 * 员工信息(工号，姓名，性别，职位，月薪)功能点:
 * 1. 员工入职(添加)
 * 2. 调整员工的月薪
 * 3. 查询所有员工
 * 4. 根据员工的工号显示员工信息
 * 5. 删除指定工号的员工
 * 6. 统计一个月发放的总工资
 */

public class Employee {
    // 工号
    private int number;
    // 名字
    private String name;
    // 性别
    private String sex;
    //职位
    private String post;
    // 月薪
    private int monthlySalary;

    public Employee() {
    }

    public Employee(int number, String name, String sex, String post, int monthlySalary) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.post = post;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "EmployeeManagementSystem{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", post='" + post + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }



}