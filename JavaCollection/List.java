package JavaCollection;

public interface List <T> {
    int DEFAULT_CAPACITY=5;
    T get(int index);
    T delete(int index);
    T[] getAll();
    void add(T o);
}

