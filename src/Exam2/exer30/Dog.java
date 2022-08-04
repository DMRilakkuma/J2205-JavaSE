package Exam2.exer30;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 16:10
 * @Description:
 */

public class Dog extends Pet {

    // 品种
    private String variety;

    public Dog() {
    }

    public Dog(String nickname, int healthValue, int intimacy, String variety) {
        super(nickname, healthValue, intimacy);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }


    @Override
    public void fedding() {
        this.healthValue = this.healthValue + 3;

    }

}