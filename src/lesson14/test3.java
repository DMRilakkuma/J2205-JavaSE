package lesson14;

import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 15:58
 * @Description:
 */

public class test3 {
    public static void main(String[] args) {


//        // 相加
//        BigDecimal bigDecimal = new BigDecimal("0.1");
//        BigDecimal bigDecimal2 = new BigDecimal("0.2");
//        BigDecimal bigDecimal3 = bigDecimal.add(bigDecimal2);
//
//        System.out.println(bigDecimal3.toString());
//        // 相减  
//        System.out.println(bigDecimal.subtract(bigDecimal2));
//        // 相乘
//        System.out.println(bigDecimal.multiply(bigDecimal));
//        // 相除
//        System.out.println(bigDecimal3.divide(bigDecimal2));

        Date date = new Date();
        // 创建时间格式的对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

    }

    @Test
    public void test() {
        double money = 321321.543423421;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(numberFormat.format(money).toString());

        NumberFormat numberFormat1 = NumberFormat.getIntegerInstance();
        System.out.println(numberFormat1.format(money));

        NumberFormat numberFormat2 = NumberFormat.getPercentInstance();
        System.out.println(numberFormat2.format(money));

        DecimalFormat decimalFormat = new DecimalFormat("##.##%");
        
    }
}