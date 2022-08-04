package lesson7;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 14:57
 * @Description:
 */
public class Course {
    // 课程号,课程名,课程学分
    private int cNum;
    private String cName;
    private double cCore;

    public Course() {
    }

    public Course(int cNum, String cName, double cCore) {
        this.cNum = cNum;
        this.cName = cName;
        this.cCore = cCore;
    }

    public int getcNum() {
        return cNum;
    }

    public void setcNum(int cNum) {
        this.cNum = cNum;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getcCore() {
        return cCore;
    }

    public void setcCore(double cCore) {
        this.cCore = cCore;
    }
}