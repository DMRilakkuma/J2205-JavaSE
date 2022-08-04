package Exam2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:32
 * @Description:
 */

public class TestGoods {
    public static void main(String[] args) {
        Goods g1 = new Goods(1, "西瓜", 100, 20, true);
        Goods g2 = new Goods(2, "南瓜", 180, 13, false);

        // 计算总价
        System.out.println(g1.totalPrice(12, 20));
        System.out.println(g2.totalPrice(19, 34));

        // 修改库存
        g1.setInventory(200);
        g1.setInventory(300);
        System.out.println(g1.getInventory());
        System.out.println(g2.getInventory());

    }
}