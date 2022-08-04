package lesson10.lianxi;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-06 10:50
 * @Description:
 */

public class test2 {
    static String url = "http://www.softeem.com/query/list.html";

    public static void main(String[] args) {
        int lastIndexOf = -1;
        lastIndexOf = url.lastIndexOf("/");
        String str1 = url.substring(lastIndexOf + 1, url.length());
        String str2 = url.substring(lastIndexOf + 1);
        System.out.println(str1);
        System.out.println(str2);
    }
}