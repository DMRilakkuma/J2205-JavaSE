package lesson5;

import lesson5.homework.Person;
import org.testng.reporters.jq.Main;

import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 09:25
 * @Description:
 */
public class test1 {
    public static void main(String[] args) {
        // 想要使用当前创建的Person类
        //这种使用new的方式创建类对象的技术:实例化创建
        Person person = new Person(); //每一次创建的实体类，都有独立存在的个体
//        person.sex = "男帅哥";
//        Person.name = "张三";
//        Person.eat();
//
//        // 方法调用，
//        person.rap();

        //当new出来的对象，每次会在当前方法结束后，被jvm虚拟机中的java垃圾回收机制将该对象回收

        // 通过创建是榨汁机Juicer类的属性和它的方法

        //先创建该类，使用的实例化，也就是new的方式
        // 根据用户的选择，实现不同品牌的榨汁机
        Juicer juicer = new Juicer("小米榨汁机");
        System.out.println("请放入你需要榨汁的水果:");
        Scanner scanner = new Scanner(System.in);
        //获取用户输入的内容
        String fruitsName = scanner.next();
        // 榨汁机开机
        juicer.start();


    }

}