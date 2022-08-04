package lesson9.homework5;

import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-05 18:48
 * @Description:
 */

public class EmpManagement {
    List<Emp> list;
    Dept dept1 = new Dept(1, "高1", "活力四射", 13456);
    Dept dept2 = new Dept(2, "高1", "活力四射", 13456);
    Dept dept3 = new Dept(3, "高1", "活力四射", 13456);

    public EmpManagement() {
    }

    public EmpManagement(List<Emp> list) {
        this.list = list;
    }

    public void add(Emp emp, int num) {
        /*
         * @author MC
         * @description //TODO 向各个部门添加num数量员工
         * @createTime  2022-07-05 18:58
         * @param add
         * @return void
         **/



    }

    public void inquiry() {
        /*
         * @author MC
         * @description //TODO 查询所有员工信息和所在部门信息
         * @createTime  2022-07-05 19:02
         * @param inquiry
         * @return void
         **/
        
    }

    public void inquiry(int number) {
        /*
         * @author MC
         * @description //TODO 根据员工工号显示员工信息
         * @createTime  2022-07-05 19:07
         * @param inquiry
         * @return void
         **/

        for (Emp emp : list) {
            if (number == emp.getNumber()) {
                System.out.println(emp.toString());
                break;
            }
        }
    }

    public void modifySalary(int number, int salary) {
        /*
         * @author MC
         * @description //TODO 根据员工工号显示员工信息
         * @createTime  2022-07-05 19:09
         * @param modifySalary
         * @return void
         **/

        for (Emp emp : list) {
            if (number == emp.getNumber()) {
                emp.setMonthlySalary(salary);
            }
        }
    }

    public void checkTheDoorNumber(int serialNumber) {
        /*
         * @author MC
         * @description //TODO 查询部门所有员工
         * @createTime  2022-07-05 19:12
         * @param checkTheDoorNumber
         * @return void
         **/


    }


}