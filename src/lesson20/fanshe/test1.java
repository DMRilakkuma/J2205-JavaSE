package lesson20.fanshe;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-30 11:47
 * @Description:
 */

public class test1 {
    public static void main(String[] args) {
        // palyWay模拟前端传来的参数
        String palyWay = "微信";
        Paly paly = null;
        if ("微信".equals(palyWay)) {
            paly = new WeCat();
        }

        if ("支付宝".equals(palyWay)) {
            paly = new Alibaba();
        }

        paly.palyOnline();
    }

    @Test
    public void test() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 不让前端传支付的类型;请给一个支付的英文名称
        String palyWay = "lesson20.fanshe.WeCat";
        Class aClass = Class.forName(palyWay);
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("palyOnline");
        method.invoke(o);

    }
}