package lesson12.test2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 15:52
 * @Description: 测试
 */

public class test {
    public static void main(String[] args) {
        // 求一个账号的全部钱
        // 本金+利息
        // 利息 = 利率 * 本金 *

        Bank bank = new Current(5, 0.0001);
        // bank：是有子类向上转型为父类,那么当前这个子类就有子类的属性和父类的属性
        // 同时还有调用子类和父类的方法和属性
        bank.setMoney(500);
        System.out.println(bank.getInterestRate() + bank.getMoney());
    }
}