package lesson16.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: day1
 * @description:
 * @author: DY
 * @create: 2022-07-15 16:47
 **/

public class Game {
    // 先生成一副54张牌
    // 分析：54张牌中，有两张大小王，剩下的全部是1-13的牌，每张牌是4个花色
    List<Poke> list = new ArrayList<>();
    String[] colors = {"♠", "❤", "♣", "♦"};

    public List<Poke> getAllPoke() {
        for (int i = 1; i <= 13; i++) {
            // 将编号1,11,12,13,改为特殊编号
            switch (i) {
                case 1:
                    // 生成四个花色的牌
                    creatPoke("A");
                    break;
                case 11:
                    creatPoke("J");
                    break;
                case 12:
                    creatPoke("Q");
                    break;
                case 13:
                    creatPoke("K");
                    break;
                default:
                    creatPoke(i + "");
                    break;
            }
        }
        // 最后将大小王放进去
        Poke bigKing = new Poke();
        bigKing.setNumber("BigKing");
        bigKing.setColor("红色");
        list.add(bigKing);

        Poke littleKing = new Poke();
        littleKing.setNumber("LittleKing");
        littleKing.setColor("黑白");
        list.add(littleKing);
        return list;
    }

    public void creatPoke(String num) {
        for (int i = 0; i < 4; i++) {
            Poke poke = new Poke();
            poke.setNumber(num);
            poke.setColor(colors[i]);
            list.add(poke);
        }
    }

    //发牌
    // 规则是：一个地主是：17+3张牌
    //        二个农民是：17张
    public void fapai() {
        List<List> allList = new ArrayList();
        // 洗牌,使用集合的一个方法将list中的内容随机打乱
        Collections.shuffle(list);
        for (int i = 0; i < 3; i++) {// 循环行
            List list1 = new ArrayList();
            for (int j = i * 17; j < (i + 1) * 17; j++) {
                // 将每17张牌放到一个list集合中，
                list1.add(list.get(j));
            }
            if (i == 2) {
                // 将剩下的三张牌，放入到最后一个集合中
                list1.add(list.get(51));
                list1.add(list.get(52));
                list1.add(list.get(53));
            }
            //{{地主的牌}，{农民1的牌}，{农民2的牌}}
            // 最后将一个人的牌的集合放入到总的集合中
            allList.add(list1);
        }
        // 将三个人的牌全部打印出来
        for (int i = 0; i < allList.size(); i++) {
            // 循环最大的这个二维集合
            for (int j = 0; j < allList.get(i).size(); j++) {
                // 取出二维集合中的每一个小集合，并将小集合中的牌打印出来
                System.out.print(allList.get(i).get(j).toString());
            }
            System.out.println();
        }
    }
}
