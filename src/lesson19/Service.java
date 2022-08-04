package lesson19;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 09:27
 * @Description:
 */

public class Service<T> {
    public void showStudent(T t) {
        if (t instanceof Student) {
        }
    }


    public void showTeacher(T t) {
        if (t instanceof Teacher) {
            System.out.println(((Teacher) t).getName());
        }
    }


}