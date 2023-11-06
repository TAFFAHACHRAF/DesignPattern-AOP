package JavaCollection;

public interface List <T> {
    T get(int index);
    T delete(int index);
    T[] getAll();
    void add(T o);
}

