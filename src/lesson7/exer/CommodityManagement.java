package lesson7.exer;

import org.omg.CORBA.ARG_OUT;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 19:57
 * @Description:
 */
public class CommodityManagement {
    // 默认商品数量最多为100;
    private Commodity[] commoditys = new Commodity[100];
    private int count;

    public CommodityManagement() {
    }

    public CommodityManagement(Commodity[] commoditys) {
        this.commoditys = commoditys;
    }

    public Commodity[] getCommoditys() {
        return commoditys;
    }

    public void setCommoditys(Commodity[] commoditys) {
        this.commoditys = commoditys;
    }

    // 商品的添加
    public void add(Commodity commodity) {
        commoditys[count++] = commodity;
    }

    // 查询指定价格范围内的商品并显示
    public void priceCommodity(int minPrice, int maxPrice) {
        for (int i = 0; i < count; i++) {
            if (commoditys[count].getUnitPrice() >= maxPrice && commoditys[count].getUnitPrice() <= maxPrice) {
                System.out.println(commoditys.toString());
            }
        }

    }

    // 更据编号查询商品信息并显示
    public void inquiry(String number) {
        for (int i = 0; i < count; i++) {
            if (commoditys[i].getNumber().equals(number)) {
                System.out.println(commoditys[i].toString());
                break;
            }
        }

    }

    // 根据编号修改商品的单价和库存
    public void modify(String number, int unitPrice, int inventory) {
        for (int i = 0; i < count; i++) {
            if (commoditys[i].getNumber().equals(number)) {
                commoditys[i].setUnitPrice(unitPrice);
                commoditys[i].setInventory(inventory);
                break;
            }
        }

    }

    // 显示所有商品信息
    public void showProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println(commoditys[i].toString());
        }
    }

    // 查询所有库存量低于指定数的商品信息
    public void checkInventory(int inventory) {
        for (int i = 0; i < count; i++) {
            if (commoditys[i].getInventory() < inventory) {
                System.out.println(commoditys[i].toString());
            }
        }
    }

    // 将指定id商品删除
    public void deleteItem(String number) {
        for (int i = 0; i < count; i++) {
            if (commoditys[i].getNumber().equals(number)) {
                for (int j = i + 1; j < count; j++) {
                    commoditys[j - 1] = commoditys[j];
                }
            }
        }
    }

    // 删除所有库存为0的商品
    public void deleteInventoryTo0() {
        for (int i = 0; i < count; i++) {
            if (commoditys[i].getInventory() == 0) {
                deleteItem(commoditys[i].getNumber());
            }
        }
    }

}