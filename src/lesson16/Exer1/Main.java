package lesson16.Exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 16:46
 * @Description:
 */

public class Main {
    static List<Student> list = new ArrayList<Student>();

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入页码:");
        int pageNow = scanner.nextInt();
        System.out.println("请输入每页数据条数:");
        int pageSize = scanner.nextInt();
        List<Student> byPage = findByPage(pageNow, pageSize);
        for (Student student : byPage) {
            System.out.println(student.toString());
        }

    }

    public static List<Student> findByPage(int pageNow, int pageSize) {

        return list.subList((pageNow - 1) * pageSize - 1, pageNow * pageSize);

    }
}