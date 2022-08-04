package lesson14;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-13 14:22
 * @Description:
 */

public class AccountManager {
    public static void main(String[] args) throws Exception {
        AccountA accountA = new AccountA(200);
        AccountB accountB = new AccountB(300);

        // 从账号A中转钱600到账号B中
        // 先判断,账号a中的钱是否够转600


        try {
            if (accountA.getMoney() - 300 < 0) {
                throw new Exception();
            }
            accountA.setMoney(accountA.getMoney() - 300);
            accountB.setMoney(accountB.getMoney() + 300);

        } catch (Exception e) {
            throw new Exception("钱不够");
        }

        System.out.println(accountA.getMoney());
        System.out.println(accountB.getMoney());

    }

    public double giveMoney(double a, double c) throws myException {
        if (a < c) {
            throw new myException("要转出的余额不足");
        }
        return a - c;
    }
}