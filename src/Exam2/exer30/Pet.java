package Exam2.exer30;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 16:21
 * @Description:
 */

public class Pet {
    public String nickname;

    public int healthValue;

    public int intimacy;

    public Pet() {
    }

    public Pet(String nickname, int healthValue, int intimacy) {
        this.nickname = nickname;
        this.healthValue = healthValue;
        this.intimacy = intimacy;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    public void fedding() {
        this.healthValue = this.healthValue+1;

    }
}