package lesson15;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-15 08:43
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        Object[] ints1 = {1, 2, 3, 4};
        Object[] ints2 = {1, 2, 3, 4};

        System.out.println(Arrays.deepEquals(ints1, ints2));
    }

    @Test
    public void test2() {
        String str1 = new String("a");
        String str2 = "a";

        System.out.println(Objects.equals(str1, str2));
    }

    @Test
    public void test3() {
        Student student1 = new Student("张三", 20, "男");
        Student student2 = new Student("张三", 20, "男");
        StringBuffer stringBuffer1 = new StringBuffer("a");
        StringBuffer stringBuffer2 = new StringBuffer("a");
        System.out.println(Objects.equals(student1, student2));
    }

    @Test
    public void test4() {
        String str = null;
        System.out.println(Objects.isNull(str));
        System.out.println(Objects.nonNull(str));
    }

    @Test
    public void test5() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextDouble());

        // 随机生成0-bound之间的随机整数，包含0，但是不包含bound
        System.out.println(random.nextInt(5));
        // 要求随机生成5-10之间的随机整数

        random.nextInt(11);
        int i = random.nextInt(50) + 1;
    }

    public void recursion() {

    }
}