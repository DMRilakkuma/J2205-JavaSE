package Exam2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:26
 * @Description: 商品
 */

public class Goods {
    // 商品编号
    private int number;
    // 名称
    private String name;
    // 库存量
    private int inventory;
    // 单价
    private int unitPrice;
    // 上架状态
    private boolean status;

    public Goods() {
    }

    public Goods(int number, String name, int inventory, int unitPrice, boolean status) {
        this.number = number;
        this.name = name;
        this.inventory = inventory;
        this.unitPrice = unitPrice;
        this.status = status;
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

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getUnitPrice() {

        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int totalPrice(int amount, int unitPrice) {
        /*
         * @author MC
         * @description //TODO 根据提供的数量和单价，计算商品价格
         * @createTime  2022-07-08 15:31
         * @param totalPrice
         * @return int
         **/

        return amount * unitPrice;
    }
}