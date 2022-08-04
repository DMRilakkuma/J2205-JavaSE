package lesson5.homework;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 18:08
 * @Description: 创建主类：
 * 创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
 * 让该对象调用成员方法：
 * 说出“你好！”
 * 计算23+45的值
 * 将名字改为“李四”
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("张三", 18, "男", 1.80);
        person.speek("你好");
        System.out.println(person.addition(23, 45));
        person.setName("李四");
        System.out.println(person.name);

    }
}