package lesson17.homework.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-19 18:27
 * @Description:
 */

public class Account {
    static int count = 1;
    private long id;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(double balance, String password) {
        this.id = count++;

        this.balance = balance;
        this.password = password;
    }

    public Account(long id, double balance, String password) {
        this.balance = balance;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}