package dynamicArray;

import java.util.Iterator;

//https://github.com/williamfiset/data-structures/blob/master/com/williamfiset/datastructures/dynamicarray/DynamicArray.java

@SuppressWarnings("unchecked")
public class DynamicArray<T> {

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
    
    private int size() {
        return len;
    }
    
    private boolean isEmpty() {
        return size() == 0 ;
    }
    
    private T get(int index){
        return arr[index];
    }
   
    private void add(T element){
        if(len + 1 >= capacity){
            capacity = (capacity == 0) ? 1 : capacity;
            T[] newArr = (T[]) new Object[capacity*2];
            int index = 0;
            for(T e : arr){
                newArr[index++] = e;
            }
           newArr[index] = element;
           len = index;
        }
    }
    
    
    

}
