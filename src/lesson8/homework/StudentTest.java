package lesson8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 16:57
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        // 添加
        list.add(new Student("王兵", 21, "男"));
        list.add(new Student("兰松柏", 20, "男"));
        list.add(new Student("彭彦哲", 27, "男"));

        // 遍历集合遍历输出
        for (Student s : list) {
            System.out.println(s.toString());
        }
        System.out.println();
        //求出年龄最大的学生，让后将该对象的姓名变为：张棒棒
        int index = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() > max) {
                max = list.get(i).getAge();
                index = i;
            }
        }
        list.get(index).setName("张棒棒");
        for (Student s : list) {
            System.out.println(s.toString());
        }

    }
}