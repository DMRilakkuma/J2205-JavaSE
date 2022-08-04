package lesson19.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 16:30
 * @Description:
 */

public class Customer {
    private int id;

    private String name;

    private String sex;

    private String password;

    private String deliveryAddress;

    private String phoneNumber;

    private String creationTime;

    public Customer() {
    }

    public Customer(int id, String name, String sex, String password, String deliveryAddress, String phoneNumber, String creationTime) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.deliveryAddress = deliveryAddress;
        this.phoneNumber = phoneNumber;
        this.creationTime = creationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", creationTime='" + creationTime + '\'' +
                '}';
    }
}

