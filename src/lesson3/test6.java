package lesson3;

import org.testng.annotations.Test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-24 11:32
 * @Description:
 */
public class test6 {
    public static void main(String[] args) {
        int maxHeight = 8848860;
        double mixHeight = 0.1;
        int count = 0;
        while (mixHeight < maxHeight) {
            mixHeight *= 2;
            count++;
        }
        System.out.println("纸张的折叠次数为" + count);
    }

    @Test
    public void test() {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count < 2);
    }

    @Test
    public void test1() {
        String a1 = null;
        System.out.println(a1);
        int a2 = 0;
        System.out.println(a2);

    }

    @Test
    public void test2() {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                //在循环体中，continue表示结束本次循环，进入下次循环
                continue;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test3() {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                // 直接中断或者结束该循环
                break;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test4() {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                //直接结束该方法
                return;
            }
            System.out.println(i);
        }
    }

}