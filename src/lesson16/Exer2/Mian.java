package lesson16.Exer2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 17:16
 * @Description:
 */

public class Mian {
    public static void main(String[] args) {
        ContactTest c = new ContactTest();
        boolean b = c.addContact(new Contact("1", "松柏", "15572010628", "1182002995", "1182002995@qq.com"));
        c.show();
        c.delete("1");
        c.show();
        System.out.println(b);
    }
}