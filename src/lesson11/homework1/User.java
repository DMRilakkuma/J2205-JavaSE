package lesson11.homework1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-07 17:10
 * @Description:
 */

public class User {
    // 用户id
    private int id;
    // 用户密码
    private String password;
    // email 地址
    private String mail ;

    public User() {
    }

    public User(int id, String password) {
        this.id = id;
        this.password = password;
        this.mail = id+"@gameschool.com";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}