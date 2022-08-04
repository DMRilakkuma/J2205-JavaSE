package lesson18.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 16:45
 * @Description:
 */

public class Student implements Comparable<Student> {
    private int studentID;

    private int age;
    private String name;


    public Student() {
    }

    public Student(int studentID, int age, String name) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.studentID - o.studentID;
    }
}