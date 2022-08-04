package lesson14;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 11:11
 * @Description:
 */

public class myException extends ClassNotFoundException {
    public myException() {
        super();
    }

    public myException(String msg) {
        System.out.println(msg);
    }
}