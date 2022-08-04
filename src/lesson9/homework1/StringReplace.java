package lesson9.homework1;

import org.testng.annotations.Test;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 16:34
 * @Description:
 */

public class StringReplace {
    public static void main(String[] args) {
        String commons = "听说凤姐去了米国，找到了心仪男票，三天两头在微博上抨击单身狗。。。。";
        //屏蔽:凤姐，男票，单身狗 规则用*替换
        String s = "凤姐男票单身狗";
        char[] chars = commons.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.indexOf(chars[i]) != -1) {
                chars[i] = '*';
            }
        }
        s = String.valueOf(chars);
        System.out.println(s);
    }

    @Test
    public void test() {


    }
}