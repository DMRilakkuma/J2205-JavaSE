package lesson8.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 17:19
 * @Description:
 */
public class EmpolyeeTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("兰松柏", 123, 1000));
        list.add(new Employee("王兵", 124, 100000));
        list.add(new Employee("彭彦喆", 125, 10000000));

        for (Employee employee : list) {
            System.out.println(employee.toString());
        }

    }
}