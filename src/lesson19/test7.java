package lesson19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 14:57
 * @Description:
 */

public class test7 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>() {
            {
                add(new Student(10086, "colleos", LocalDate.of(1998, 8, 11), "软件工程", 89.5, "男"));
                add(new Student(10010, "curry", LocalDate.of(1999, 9, 11), "计算机科学", 58.5, "女"));
                add(new Student(10011, "tom", LocalDate.of(1996, 10, 11), "软件工程", 49.5, "男"));
                add(new Student(10011, "tom", LocalDate.of(1996, 10, 11), "软件工程", 49.5, "男"));
                add(new Student(10032, "james", LocalDate.of(1995, 11, 17), "计算机科学", 79.5, "男"));
                add(new Student(10055, "rose", LocalDate.of(1994, 7, 13), "计算机科学", 89, "女"));
                add(new Student(10076, "jack", LocalDate.of(1998, 5, 21), "计算机科学", 55.5, "男"));
                add(new Student(10098, "tompson", LocalDate.of(1999, 6, 19), "网络工程", 69, "女"));
                add(new Student(10012, "garnett", LocalDate.of(1997, 8, 17), "网络工程", 89.5, "男"));
                add(new Student(10018, "akli", LocalDate.of(1998, 6, 11), "软件工程", 89.5, "女"));
                add(new Student(10015, "lulu", LocalDate.of(1996, 1, 20), "软件工程", 87, "男"));
                add(new Student(10099, "zark", LocalDate.of(1999, 2, 22), "软件工程", 77.5, "男"));
            }
        };

        List<Student> stream = list.stream()
                .filter(s -> Objects.equals(s.getSex(), "男"))
                .filter(s -> s.getScore() >= 60)
                .distinct()
                .sorted((s1, s2) -> (int) (s1.getScore() - s2.getScore()))
                .skip(2)
                .limit(5)
                .collect(Collectors.toList());
        stream.forEach(u -> System.out.println(u));


    }

}