package lesson5.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 18:21
 * @Description: 创建主类：
 * 在主类中创建两个机动车对象。
 * 创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“辽A9752”，并让其加速。
 * 创建第二个时调用有参数的构造方法，使其车牌为“辽B5086”,车速为150,
 * 载重为200，并让其减速。
 * 输出两辆车的所有信息
 */
public class MotorVehicleTest {
    public static void main(String[] args) {
        // 无参构造
        MotorVehicle motor1 = new MotorVehicle();
        //修改车牌号
        motor1.numberPlate = "辽A9752";
        // 自动加速
        motor1.autoIncrement();
        // 有参构造
        MotorVehicle motor2 = new MotorVehicle("辽B5086", 150, 200);
        //自动减速
        motor2.decrement();
        // 输出信息
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());

    }
}