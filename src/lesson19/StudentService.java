package lesson19;

import java.util.List;

public interface StudentService<S> {
    void add(S s);

    void delete(int id);

    void update(S s);

    List<S> getAll();

}
