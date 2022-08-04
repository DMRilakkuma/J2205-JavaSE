package lesson19;

import java.util.List;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 09:45
 * @Description: 接口的泛型, 子类在实现接口类的时候，就需要对接口中的泛型添上
 */

public class StudentServiceImpl implements StudentService<Student> {
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public List<Student> getAll() {
        return null;
    }
}