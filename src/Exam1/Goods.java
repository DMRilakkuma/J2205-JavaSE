package Exam1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-01 16:16
 * @Description:
 */
public class Goods {
    private int number;
    private String name;
    private int inventory;
    private int unitPrice;
    private boolean onTheShelf;

    public Goods() {
    }

    public Goods(int number, String name, int inventory, int unitPrice, boolean onTheShelf) {
        this.number = number;
        this.name = name;
        this.inventory = inventory;
        this.unitPrice = unitPrice;
        this.onTheShelf = onTheShelf;
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

    public boolean isOnTheShelf() {
        return onTheShelf;
    }

    public void setOnTheShelf(boolean onTheShelf) {
        this.onTheShelf = onTheShelf;
    }

    //计算商品价格
    public int calculatePrice(int num, int unitPrice) {
        return num * unitPrice;
    }

    //修改商品的库存量
    public void modifyInventory(int inventory) {
        setInventory(inventory);
    }
}