package dynamicArray;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T>{

    private T[] arr;
    private int len = 0;
    private int capacity = 0;

    public DynamicArray(int capacity)  {
        //if(capacity < 0) throw new IllegalAccessException("illegal Capacity: ");
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];


    }
    
    public DynamicArray() {
        this(16);
    }

    public Iterator<T> iterator() {
        return null;
    }
}
