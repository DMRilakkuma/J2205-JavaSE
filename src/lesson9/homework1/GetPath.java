package lesson9.homework1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 16:47
 * @Description:
 */

public class GetPath {
    public static void main(String[] args) {
        String url = "http://www.softeem.com/query/list.html";
        int i = url.lastIndexOf("/");
        System.out.println(url.substring(i + 1));
    }
}