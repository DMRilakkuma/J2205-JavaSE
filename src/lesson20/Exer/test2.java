package lesson20.Exer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 15:34
 * @Description:
 */

public class test2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Class aClass = Class.forName(s);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod("cry");
        method.invoke(o);
    }
}