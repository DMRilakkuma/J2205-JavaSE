package lesson8.lianxi;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-04 09:14
 * @Description:
 */
public class Goods {
    // 商品类（编号，名称，类别，单价，库存量，生产地）
    private int number;
    private String name;
    private String type;
    private double price;
    private int stock;
    private String produce;

    public Goods() {
    }

    public Goods(int number, String name, String type, double price, int stock, String produce) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.price = price;
        this.stock = stock;
        this.produce = produce;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", produce='" + produce + '\'' +
                '}';
    }
}