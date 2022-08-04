package lesson16.Exer2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 16:57
 * @Description:
 */

public class Contact {
    private String id;
    private String name;
    private String phoneNumber;
    private String qq;
    private String mails;

    public Contact() {
    }

    public Contact(String id, String name, String phoneNumber, String qq, String mails) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.qq = qq;
        this.mails = mails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMails() {
        return mails;
    }

    public void setMails(String mails) {
        this.mails = mails;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", qq='" + qq + '\'' +
                ", mails='" + mails + '\'' +
                '}';
    }
}