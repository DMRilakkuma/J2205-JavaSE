package lesson19.homework1;

import java.util.*;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-07-21 16:13
 * @Description:
 */

public class DAOTest implements DAO<Student> {
    private Map<String, Student> map = new HashMap<>();

    @Override
    public void insert(Student student) {
        map.put(student.getSno(), student);
    }

    @Override
    public Student findById(String id) {
        if (!map.containsKey(id)) {
            System.out.println("没有此学生");
            return null;
        }

        return map.get(id);
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            list.add(entry.getValue());
        }
        return list;
    }

    @Override
    public void delete(String id) {
        if (!map.containsKey(id)) {
            System.out.println("没有此学生");
        } else {
            map.remove(id);
        }


    }


}