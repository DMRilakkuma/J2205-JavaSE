package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 14:47
 * @Description:
 */
public class Student {
    //姓名
    private String name;
    private int number;
    private String subject;

    public Student() {

    }

    public Student(String name, int number, String subject) {
        this.name = name;
        this.number = number;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}