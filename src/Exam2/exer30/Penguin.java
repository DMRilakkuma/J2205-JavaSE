package Exam2.exer30;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 16:18
 * @Description:
 */

public class Penguin extends Pet {

    private String sex;

    public Penguin() {
    }

    public Penguin(String nickname, int healthValue, int intimacy, String sex) {
        super(nickname, healthValue, intimacy);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void fedding() {
        this.healthValue = this.healthValue + 5;

    }

}