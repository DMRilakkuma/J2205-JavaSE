package lesson12.homework1;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-11 17:06
 * @Description:
 */

public class Student {
    // 学号
    private String studentID;

    // 姓名
    private String name;

    // 语文成绩
    private int languageScore;

    // 数学成绩
    private int mathScores;

    // 英语成绩
    private int englishScore;

    public Student() {
    }

    public Student(String studentID, String name, int languageScore, int mathScores, int englishScore) {
        this.studentID = studentID;
        this.name = name;
        this.languageScore = languageScore;
        this.mathScores = mathScores;
        this.englishScore = englishScore;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguageScore() {
        return languageScore;
    }

    public void setLanguageScore(int languageScore) {
        this.languageScore = languageScore;
    }

    public int getMathScores() {
        return mathScores;
    }

    public void setMathScores(int mathScores) {
        this.mathScores = mathScores;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", languageScore=" + languageScore +
                ", mathScores=" + mathScores +
                ", englishScore=" + englishScore +
                '}';
    }
}