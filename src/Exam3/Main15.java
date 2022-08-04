package Exam3;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 09:08
 * @Description:
 */

public class Main15 extends Demo {
    public static void main(String[] args) {
        String s1 = new String("pb_java_OPP_T5");
        System.out.println(s1.substring(s1.lastIndexOf("_")));
        SimpleDateFormat s2 = new SimpleDateFormat();
        DateFormat d = new DateFormat() {
            @Override
            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
                return null;
            }

            @Override
            public Date parse(String source, ParsePosition pos) {
                return null;
            }
        };


        int i = Integer.parseInt("123");
        System.out.println(i);

        StringBuffer sb = new StringBuffer("abcde");
        sb.delete(1, 2);
        System.out.println(sb);
        int a = (int) (Math.random() * (60 - 30 + 1) + 30);
    }


}