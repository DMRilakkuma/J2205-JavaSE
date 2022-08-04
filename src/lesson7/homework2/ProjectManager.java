package lesson7.homework2;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:12
 * @Description:
 */
public class ProjectManager extends Programmer {
    // 奖金
    private int bonus;

    public ProjectManager() {
    }

    public ProjectManager(String name, String jobNumber, int wage, int bonus) {
        super(name, jobNumber, wage);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名" + this.getName() + "工号" + this.getName() + "工资:" + this.getWage() + "奖金" + this.getBonus());
    }
}
