package Exam1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 16:21
 * @Description:
 */
public class GoodsTest {
    public static void main(String[] args) {
        Goods g1 = new Goods(1, "西瓜", 100,20,true );
        Goods g2 = new Goods(2, "白菜", 100,26,true );
        System.out.println(g1.calculatePrice(3, 20));
        g1.setInventory(200);
        System.out.println(g1.getInventory());
        System.out.println(g1.calculatePrice(2, 26));
        g1.setInventory(300);
        System.out.println(g1.getInventory());


    }
}