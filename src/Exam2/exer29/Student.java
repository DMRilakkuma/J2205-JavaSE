package Exam2.exer29;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-08 15:41
 * @Description:
 */

public class Student {
    // 学号
    private String studentID;
    // 姓名
    private String name;
    // 语文成绩
    private int LanguageScore;
    // 数学成绩
    private int mathScores;
    // 英语成绩
    private int englishResults;

    public Student() {
    }

    public Student(String studentID, String name, int languageScore, int mathScores, int englishResults) {
        this.studentID = studentID;
        this.name = name;
        LanguageScore = languageScore;
        this.mathScores = mathScores;
        this.englishResults = englishResults;
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
        return LanguageScore;
    }

    public void setLanguageScore(int languageScore) {
        LanguageScore = languageScore;
    }

    public int getMathScores() {
        return mathScores;
    }

    public void setMathScores(int mathScores) {
        this.mathScores = mathScores;
    }

    public int getEnglishResults() {
        return englishResults;
    }

    public void setEnglishResults(int englishResults) {
        this.englishResults = englishResults;
    }

    public double averageScore() {
        /*
         * @author MC
         * @description //TODO 计算学员平均成绩
         * @createTime  2022-07-08 15:46
         * @param averageScore
         * @return double
         **/

        return (double) (getLanguageScore() + getMathScores() + getEnglishResults()) / 3;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", LanguageScore=" + LanguageScore +
                ", mathScores=" + mathScores +
                ", englishResults=" + englishResults +
                '}';
    }
}