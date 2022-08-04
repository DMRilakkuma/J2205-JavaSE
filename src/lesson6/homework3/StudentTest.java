package lesson6.homework3;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-29 16:15
 * @Description:
 */
public class StudentTest {
    // 学校总人数
    private Student[] student;

    public StudentTest() {
    }

    public StudentTest(Student[] student) {
        this.student = student;
    }

    public Student[] getList() {
        return student;
    }

    public void setList(Student[] student) {
        this.student = student;
    }

    // 添加学生,一次性可以添加多个学生
    public void addStudent(Student s) {
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                student[i] = s;
                break;
            }
        }
        show();

    }

    //根据学号，删除学生
    public void delete(int studentID) {
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null && student[i].getStudentID() == studentID) {
                student[i] = null;
                break;
            }
        }
        show();
    }


    //根据学号，修改指定学生的学分
    public void modify(int studentID, double credit) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].getStudentID() == studentID) {
                student[i].setCredit(credit);
                break;
            }
        }
        show();
    }

    // 显示所有学生信息
    public void show() {
        for (Student s : student) {
            if (s != null) {
                System.out.println(s.toString());
            }
        }
    }

    //查询所有学分超过80分的信息
    public void inquiry() {
        for (Student s : student) {
            if (s != null && s.getCredit() > 80) {
                System.out.println(student.toString());
            }
        }
    }

}