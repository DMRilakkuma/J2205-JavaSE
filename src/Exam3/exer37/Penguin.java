package Exam3.exer37;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-16 09:44
 * @Description:
 */

public class Penguin extends Pet {

    // 性别
    private String sex;

    public Penguin() {
    }

    public Penguin(String name, int healthValue, int intimacy, String sex) {
        super(name, healthValue, intimacy);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void show() {
        System.out.println("姓名:" + this.name + " 健康值" + this.healthValue + " 亲密度:" + this.intimacy +
                " 性别:" + this.sex);
    }
}