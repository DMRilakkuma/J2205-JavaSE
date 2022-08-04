package lesson5.homework4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-28 18:50
 * @Description: 创建一个商品类（Goods），内部包含5个商品的基本信息，2个行为方法（计算N件商品价格，修改商品的库存量）?
 */
public class Goods {
    String name;
    double price;
    double weight;
    int amount;
    String color;

    // 计算n件商品的总和
    public double totalPrice(int n) {
        return n * price;
    }

    // 修改商品的库存量
    public void setPrice(int amount){
        this.amount = amount;
    }

}