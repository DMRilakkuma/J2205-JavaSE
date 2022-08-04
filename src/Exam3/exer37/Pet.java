package Exam3.exer37;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 09:42
 * @Description:
 */

public abstract class Pet {
    // 姓名
    public String name;

    //健康值
    public int healthValue;

    //亲密度
    public int intimacy;

    public Pet() {
    }

    public Pet(String name, int healthValue, int intimacy) {
        this.name = name;
        this.healthValue = healthValue;
        this.intimacy = intimacy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    // 展示信息
    public abstract void show();

}