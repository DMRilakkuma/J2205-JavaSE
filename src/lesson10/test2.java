package lesson10;

import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 15:39
 * @Description:
 */

public class test2 {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
//        //当前系统的纳秒
//        System.out.println(System.currentTimeMillis());
        //时间戳
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Timestamp timestamp1 = new Timestamp(System.nanoTime());
//        System.out.println(timestamp);
//        System.out.println(timestamp1);
        Date date = new Date();
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str+=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }

    @Test
    public void test(){
        long startTime = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    @Test
    public void test2(){
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}