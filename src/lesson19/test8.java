package lesson19;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 15:26
 * @Description:
 */

public class test8 {
    public static void main(String[] args) {
        Date date = new Date();

        // 需要将当前系统日期转化为固定格式的时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd  HH:mm:ss");
        String format = simpleDateFormat.format(date);
        long l = System.currentTimeMillis();
        System.out.println(simpleDateFormat.format(l));
        System.out.println(format);
    }
}