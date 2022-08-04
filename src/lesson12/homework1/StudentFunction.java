package lesson12.homework1;

public interface StudentFunction {
    //  单个学生的录入
    void addStudent(Student student);

    // 显示所以学生信息
    void showStudent();

    // 删除学生
    void deleteStudent(int studentId);

    // 统计学生总分
    void totalScore();
}
