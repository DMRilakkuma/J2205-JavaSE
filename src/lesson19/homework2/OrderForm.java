package lesson19.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 16:33
 * @Description:
 */

public class OrderForm {
    private String orderNumber;

    private String creationTime;

    private int dishId;

    private int numberOfPurchases;

    private int userId;

    private int totalCost;

    private int orderStatus;

    public OrderForm() {
    }

    public OrderForm(String orderNumber, String creationTime, int dishId, int numberOfPurchases, int userId, int totalCost, int orderStatus) {
        this.orderNumber = orderNumber;
        this.creationTime = creationTime;
        this.dishId = dishId;
        this.numberOfPurchases = numberOfPurchases;
        this.userId = userId;
        this.totalCost = totalCost;
        this.orderStatus = orderStatus;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }

    public void setNumberOfPurchases(int numberOfPurchases) {
        this.numberOfPurchases = numberOfPurchases;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "orderNumber='" + orderNumber + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", dishId=" + dishId +
                ", numberOfPurchases=" + numberOfPurchases +
                ", userId=" + userId +
                ", totalCost=" + totalCost +
                ", orderStatus=" + orderStatus +
                '}';
    }
}