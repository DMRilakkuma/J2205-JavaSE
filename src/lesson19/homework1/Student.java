package lesson19.homework1;

import java.time.LocalDate;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 09:12
 * @Description:
 */

public class Student {

    private String sno;
    private String name;

    private LocalDate birth;

    private String major;

    private double score;

    private String sex;

    public Student() {
    }

    public Student(String sno, String name, LocalDate birth, String major, double score, String sex) {
        this.sno = sno;
        this.name = name;
        this.birth = birth;
        this.major = major;
        this.score = score;
        this.sex = sex;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", major='" + major + '\'' +
                ", score=" + score +
                ", sex='" + sex + '\'' +
                '}';
    }
}