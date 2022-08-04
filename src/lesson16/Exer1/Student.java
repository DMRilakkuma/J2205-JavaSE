package lesson16.Exer1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-18 16:18
 * @Description:
 */

public class Student {
    private int sno;
    private String sname;
    private String sex;
    private String birth;
    private String major;
    private String score;

    public Student() {
    }

    public Student(int sno, String sname, String sex, String birth, String major, String score) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.birth = birth;
        this.major = major;
        this.score = score;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", major='" + major + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}