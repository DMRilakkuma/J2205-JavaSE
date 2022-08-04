package lesson20.Exer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 14:53
 * @Description:
 */

public class exer1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        Class aClass = Class.forName(className);
        Dog dog = (Dog) aClass.newInstance();
        Field[] fields = aClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        Method[] methods = aClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());
        Package aPackage = superclass.getPackage();
        System.out.println(aPackage.getName());

    }
}