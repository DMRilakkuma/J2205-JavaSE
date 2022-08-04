package lesson19.homework1;

import java.util.List;

public interface DAO<T> {
    public void insert(T t);

    public T findById(String id);

    public List<T> findAll();

    public void delete(String id);
}
