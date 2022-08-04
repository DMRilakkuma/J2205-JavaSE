package lesson19.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 16:26
 * @Description:
 */

public class Dishes {
    private int dishId;

    private String name;

    private int typeOfDish;

    private String addedTime;

    private int unitPrice;

    private int monthlySales;

    private int theTotalNumber;

    public Dishes() {
    }

    public Dishes(int dishId, String name, int typeOfDish, String addedTime, int unitPrice, int monthlySales, int theTotalNumber) {
        this.dishId = Dishes.this.dishId;
        this.name = name;
        this.typeOfDish = typeOfDish;
        this.addedTime = addedTime;
        this.unitPrice = unitPrice;
        this.monthlySales = monthlySales;
        this.theTotalNumber = theTotalNumber;
    }

    public int getId() {
        return dishId;
    }

    public void setId(int dishId) {
        this.dishId = Dishes.this.dishId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(int typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(int monthlySales) {
        this.monthlySales = monthlySales;
    }

    public int getTheTotalNumber() {
        return theTotalNumber;
    }

    public void setTheTotalNumber(int theTotalNumber) {
        this.theTotalNumber = theTotalNumber;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "dishId=" + dishId +
                ", name='" + name + '\'' +
                ", typeOfDish='" + typeOfDish + '\'' +
                ", addedTime='" + addedTime + '\'' +
                ", unitPrice=" + unitPrice +
                ", monthlySales=" + monthlySales +
                ", theTotalNumber=" + theTotalNumber +
                '}';
    }
}