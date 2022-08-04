package lesson7.exer;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 19:52
 * @Description:
 */
public class Commodity {
    // 编号
    private String number;
    // 名称
    private String name;
    // 类别
    private String category;
    // 单价
    private int unitPrice;
    // 库存量
    private int inventory;
    // 生产地
    private String productionPlace;

    public Commodity() {
    }

    public Commodity(String number, String name, String category, int unitPrice, int inventory, String productionPlace) {
        this.number = number;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
        this.inventory = inventory;
        this.productionPlace = productionPlace;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getProductionPlace() {
        return productionPlace;
    }

    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace;
    }

    @Override
    public String toString() {
        return
                "编号:" + number + '\'' +
                        ",名字:" + name + '\'' +
                        ",类别:" + category + '\'' +
                        ",单价:" + unitPrice +
                        ",库存量:" + inventory +
                        ",生成地:" + productionPlace;
    }
}