package lesson13;

import org.testng.annotations.Test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-12 10:44
 * @Description:
 */

public class test {
    public static void main(String[] args) {
        People people = new People();

        // 内嵌内部类创建方式
        People.Person person = people.new Person();
        person.speak();

        Human human = new Human();
        human.speak();
    }

    @Test
    public void test() {
        People people = new People();
        people.speak("黄色");
    }

    @Test
    public void test2() {
        People people = new People();
        int low = People.myCache.low;
        System.out.println(low);

        People.myCache myCache = new People.myCache();
    }
}

