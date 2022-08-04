package lesson6.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 16:11
 * @Description:
 */
public class Student {
    private int studentID;
    private String name;
    private String sex;
    private int age;
    private String specialty;
    private double credit;

    public Student() {
    }

    public Student(int studentID, String name, String sex, int age, String specialty, double credit) {
        this.studentID = studentID;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.specialty = specialty;
        this.credit = credit;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }
}