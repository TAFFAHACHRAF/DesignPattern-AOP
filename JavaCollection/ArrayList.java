package JavaCollection;

public class ArrayList<T> implements List<T> {
    private T[] items = (T[]) new Object[100]; // Create an Object array and cast it to T[]
    private static int size=0;

    @Override
    public T get(int index) {
        return items[index];
    }

    @Override
    public T delete(int index) {
        T deletedItem=items[index];
        items[index] = null;
        int i;
        for (i = index; i < size; i++) {
            items[i] = items[i + 1];
        }
        items[i] = null;
        size--;
        return deletedItem;
    }

    @Override
    public T[] getAll() {
        return items;
    }

    @Override
    public void add(T o) {
        items[size()] = o;
        size++;
    }
    public int size(){
        return size;
    }
}
