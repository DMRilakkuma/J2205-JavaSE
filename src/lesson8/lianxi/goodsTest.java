package lesson8.lianxi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 09:19
 * @Description:
 */
public class goodsTest {
    static List<Goods> goodsList;

    public static void main(String[] args) {
        // 商品管理类
        // 会调用ArrayList的无参构造,创建一个长度为10的集合对象
        goodsList = new ArrayList<>();
        goodsList.add(new Goods(1, "雪糕", "食品", 1, 10000, "湖北武汉"));
        goodsList.add(new Goods(2, "钟薛糕", "食品", 80, 10, "湖北武汉"));
        goodsList.add(new Goods(2, "酸奶", "食品", 12, 2000, "湖北武汉"));
        goodsList.add(new Goods(2, "牛奶", "食品", 5, 300, "湖北武汉"));
        goodsList.add(new Goods(2, "冰淇淋", "食品", 9, 5000, "湖北武汉"));
        getGoodsByGoodsNumber(1);

    }

    public static void getGoodsByGoodsNumber(int number) {
        /*
         * @author MC
         * @description //TODO 查询指定商品信息
         * @createTime  2022-07-04 11:00
         * @param getGoodsByGoodsNumber
         * @return void
         **/


        // 创建一个goods对象，来接受被查询的goods信息
        Goods goods = new Goods();
        for (Goods g : goodsList) {
            if (number == g.getNumber()) {
                // 如果商品编号相同就找到该商品。默认每个商品的编号都是唯一的
                goods = g;
                break;
            }
        }
        System.out.println("商品查到的信息为:" + goods.getName());
    }


    private void update(Goods goods) {
        /*
         * @author MC
         * @description //TODO 根据商品的编号修改单价和库存
         * @createTime  2022-07-04 10:31
         * @param update
         * @return void
         **/

        if (goods != null) {
            for (int i = 0; i < goodsList.size(); i++) {
                if (goods.getNumber() == goodsList.get(i).getNumber()) {
                    goodsList.set(i, goods);
                    break;
                }
            }
        }
    }

    public void deleteGoodsByGoodsNumber(int number) {
        /*
         * @author MC
         * @description //TODO 将指定id商品删除
         * @createTime  2022-07-04 10:53
         * @param deleteGoodsByGoodsNumber
         * @return void
         **/

        // 在集合进行循环的时候,不可以对当前的集合进行add和remove操作
        int j = -1;
        for (int i = 0; i < goodsList.size(); i++) {
            if (number == goodsList.get(i).getNumber()) {
                // 此时获取到当前goods的位置索引，然后终止循环
                j = i;
            }
        }
        if (j >= 0) {
            goodsList.remove(j);
            System.out.println("删除成功");
        } else {
            System.out.println("你要删除的数据没有找到");
        }
    }

    public void showGoods() {
        /*
         * @author MC
         * @description //TODO 将所有商品展示出来
         * @createTime  2022-07-04 11:01
         * @param showGoods
         * @return void
         **/

        for (Goods g : goodsList) {
            System.out.println(g.toString());
        }
    }
}