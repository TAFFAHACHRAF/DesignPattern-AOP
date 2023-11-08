package JavaCollection;

import java.util.Arrays;

public class Set<T> implements List <T>{
    private T[] items = (T[]) new Object[DEFAULT_CAPACITY]; // Create an Object array and cast it to T[]
    private static int size=0;
    @Override
    public T get(int index) {
        return this.items[index];
    }

    @Override
    public T delete(int index) {
        T deletedItem=items[index];
        items[index]=null;
        for(int i=index;i<items.length-1;i++){
            items[i]=items[i+1];
        }
        return deletedItem;
    }

    @Override
    public T[] getAll() {
        return items;
    }

    public void voidShowAll(){
        for(T t:items){
            if(t != null){
                System.out.println(t);
            }
        }
    }

    public boolean contains(T element){
        for(T t:items){
            if(t==element){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T o) {
        if(!this.contains(o)) {
            if (items.length != size) {
                for (int i = 0; i < items.length; i++) {
                    if (items[i] == null) {
                        items[i] = o;
                        size++;
                        return;
                    }
                }
            } else {
                items = Arrays.copyOf(items, size * 2);
                add(o);
            }
        }
    }
}
