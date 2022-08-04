package lesson6.homework1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 15:30
 * @Description:
 */
public class HeroTest {
    public static void main(String[] args) {
        Hero hero1 = new Hero(1, "x", "刘备", "上单", 100, 50, 200, 80);
        Hero hero2 = new Hero(2, "y", "后羿", "ADC", 120, 30, 180, 90);
        // 轮流攻击
        while (true) {
            hero1.attack(hero2);
            // 判断是否死亡
            if (hero2.death()) {
                if (hero2.rebirth()) {
                    System.out.println("hero2重生成功");
                } else {
                    System.out.println("hero2先死亡");
                    break;
                }
            }
            hero2.attack(hero1);
            if (hero1.death()) {
                if (hero1.rebirth()) {
                    System.out.println("hero1重生成功");
                } else {
                    System.out.println("hero1先死亡");
                    break;
                }
            }
        }

    }
}