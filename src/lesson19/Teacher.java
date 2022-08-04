package lesson19;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 09:26
 * @Description:
 */

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    class mytest {
        public void test() {
            System.out.println("test");
        }
    }
}