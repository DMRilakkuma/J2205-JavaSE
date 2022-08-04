package Exam3.exer37;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 09:44
 * @Description:
 */

public class Dog extends Pet {

    // 品种
    private String variety;

    public Dog() {
    }

    public Dog(String name, int healthValue, int intimacy, String variety) {
        super(name, healthValue, intimacy);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public void show() {
        System.out.println("姓名:" + this.name + " 健康值" + this.healthValue + " 亲密度:" + this.intimacy +
                " 品种:" + this.variety);
    }
}