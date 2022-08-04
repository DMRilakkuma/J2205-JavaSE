package lesson7.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-30 18:37
 * @Description:
 */
public class Student {
    // 学号
    private int studentID;
    // 姓名
    private String name;
    // 数学成绩
    private int mathScores;
    // 英语成绩
    private int EnglishScores;
    // 语文成绩
    private int ChineseScore;

    public Student() {
    }

    public Student(int studentID, String name, int mathScores, int englishScores, int chineseScore) {
        this.studentID = studentID;
        this.name = name;
        this.mathScores = mathScores;
        EnglishScores = englishScores;
        ChineseScore = chineseScore;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScores() {
        return mathScores;
    }

    public void setMathScores(int mathScores) {
        this.mathScores = mathScores;
    }

    public int getEnglishScores() {
        return EnglishScores;
    }

    public void setEnglishScores(int englishScores) {
        EnglishScores = englishScores;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    @Override
    public String toString() {
        return "学号:" + studentID +
                ", 名字:" + name  +
                ", 数学成绩:" + mathScores +
                ", 英语成绩:" + EnglishScores +
                ", 语文成绩:" + ChineseScore;
    }
}