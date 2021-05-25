package dynamicArray2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

@SuppressWarnings("unchecked")
public class MyArray <T> {

    private T[] arr;
    private int len = 0;
    private int currentSize = 0;

    public MyArray(){
        this(16);
    }

    public MyArray(int initialLength){
        this.currentSize = initialLength;
        arr = (T[]) new Object[currentSize];
    }

    public int getSize(){
        return this.len;
    }

    public void add(T element){
        if(len >= currentSize){
            currentSize=2*currentSize;
            Object[] newArray = new Object[currentSize*2];
            int i = 0;
            for ( T e : arr ){
                newArray[i++] = e;
            }
            arr = (T[]) newArray;
        }
        arr[len++] = element;
    }

    protected boolean set(int index, T element){
        if(index > len)
            return false;
        arr[index] = element;
        return true;
    }

    protected int indexOf(T element){
        int i = 0;
        for(T e: arr){
            if(element.equals(e))
                return i;
            i++;
        }
        return -1;
    }

    protected boolean removeAt(int index){
        if(index > len-1)
            return false;

        if(index == len-1){
            arr[len-1] = null;
            //return true;
        }
        for(int i = 0; i+index < len - 1; i++ ){
            arr[index+i] = arr[index+i+1];
        }

        return true;
    }
    protected void clear(){
        for(int i = 0; i < len; i++){
            arr[i] = null;
        }

    }

    protected boolean contains(T element){
        return this.indexOf(element)!= -1 ? true : false;
    }

    protected boolean removeObj(T element){
        int index = this.indexOf(element);
        if(index == -1)
            return false;
        this.removeAt(index);
        return true;
    }





    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }

}
