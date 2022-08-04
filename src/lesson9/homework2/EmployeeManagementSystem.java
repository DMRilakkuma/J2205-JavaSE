package lesson9.homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 17:16
 * @Description:
 */

public class EmployeeManagementSystem {
    List<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        /*
         * @author MC
         * @description //TODO 员工的添加
         * @createTime  2022-07-05 17:17
         * @param addEmployee
         * @return void
         **/

        list.add(employee);
    }

    public void setMonthlySalary(Employee employee, int monthlySalary) {
        /*
         * @author MC
         * @description //TODO 调整员工的月薪
         * @createTime  2022-07-05 17:18
         * @param setMonthlySalary
         * @return void
         **/

        employee.setMonthlySalary(monthlySalary);
    }

    public void queryAllEmployees() {
        /*
         * @author MC
         * @description //TODO 查询所有员工
         * @createTime  2022-07-05 17:30
         * @param queryAllEmployees
         * @return void
         **/

        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }

    public void showNumber(int number) {
        /*
         * @author MC
         * @description //TODO 删除指定工号的员工
         * @createTime  2022-07-05 18:03
         * @param showNumber
         * @return void
         **/

        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (number == list.get(i).getNumber()) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("没有找到指定员工");
        } else {
            list.remove(index);
        }

    }

    public int grossSalary() {
        /*
         * @author MC
         * @description //TODO 统计一个月发放的总工资
         * @createTime  2022-07-05 18:07
         * @param grossSalary
         * @return void
         **/

        int total = 0;
        for (Employee employee : list) {
            total += employee.getMonthlySalary();
        }

        return total;

    }

}