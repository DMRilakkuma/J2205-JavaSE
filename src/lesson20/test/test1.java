package lesson20.test;

import lesson20.fanshe.Student;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 09:34
 * @Description:
 */

public class test1 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Student student = new Student();

        // 通过反射的方式创建这个实列对象
        Class aClass = Class.forName("lesson20.fanshe.Student");
        // 此时的aClass并不是student对象,而只是student的字节码文件
        // 如何将class对象如何转化为对应的实体类对象
        Student student1 = (Student) aClass.newInstance();
        System.out.println(student1);
        System.out.println("包名" + aClass.getName());
        System.out.println("类名" + aClass.getSimpleName());

        // 获取所有public修饰的属性
        // 这种思路是将studnet的公有属性,有基础变量转换位的一个对象,也就是filed对象
        Field[] fields = aClass.getDeclaredFields();
        /*Field[] fields = aClass.getFields();*/
        for (Field f : fields) {

            System.out.println(f.getName());
        }

        // name属性赋值  getField获取被public修饰的属性
        Field field_name = aClass.getField("name");
        System.out.println("找到属性名称是:" + field_name.getName());

        // 给这个属性设置和取值,其中
        field_name.set(student1, "张三");
        System.out.println("找到属性名称是:" + field_name.get(student1));
        // getDeclaredField 获取私有属性和公有属性
        Field sex = aClass.getDeclaredField("sex");
        sex.setAccessible(true);
        sex.set(student1, '男');
        System.out.println(sex.get(student1));

        // 获取当前student中每一个属性,是被什么修饰符修饰
        Field[] fields1 = aClass.getDeclaredFields();
        for (Field f : fields1) {
            System.out.println(f.getName() + "修饰符" + f.getModifiers());
        }

        // 获取当前类中clazz中所有的方法名称
        Method[] methods = aClass.getMethods();
        for (Method m : methods) {
            System.out.println("当前的方法名称为" + m.getName());
        }

        Method method = aClass.getDeclaredMethod("eat");
        System.out.println("私有方法是" + method.getName());
        method.setAccessible(true);
        method.invoke(student1);

        // 调用有参构造
        Method method1 = aClass.getDeclaredMethod("showCore", String.class, int.class);
        method1.invoke(student1, "张三", 90);
        

    }
}