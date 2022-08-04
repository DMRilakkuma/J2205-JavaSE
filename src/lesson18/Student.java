package lesson18;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-20 14:28
 * @Description:
 */

public class Student implements Comparable<Student> {
    private int id;

    private String name;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        // 比较规则还没写
        return this.name.compareTo(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}