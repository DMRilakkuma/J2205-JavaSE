package Exam2.exer29;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:49
 * @Description:
 */

public class PerformanceManagement {
    List<Student> list = new ArrayList<>();

    public void addStudent(Student student) {
        if (list.size() == 0 || student.averageScore() < list.get(0).averageScore()) {
            list.add(0, student);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (student.averageScore() >= list.get(i).averageScore()) {
                    list.add(i + 1, student);
                    break;
                }
            }
        }
    }

    public void removeStudent(String studentID) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (studentID.equals(list.get(i).getStudentID())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到");
        } else {
            list.remove(index);
        }
    }

    public void showStudent() {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}