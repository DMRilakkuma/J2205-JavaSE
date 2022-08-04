package lesson19.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 16:29
 * @Description:
 */

public class AdministratorClass {
    private int dishId;

    private String account;

    private String password;

    public AdministratorClass() {
    }

    public AdministratorClass(int dishId, String account, String password) {
        this.dishId = AdministratorClass.this.dishId;
        this.account = account;
        this.password = password;
    }

    public int getId() {
        return dishId;
    }

    public void setId(int dishId) {
        this.dishId = AdministratorClass.this.dishId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdministratorClass{" +
                "dishId=" + dishId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}