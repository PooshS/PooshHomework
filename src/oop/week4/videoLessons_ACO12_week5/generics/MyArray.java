package oop.week4.videoLessons_ACO12_week5.generics;

public class MyArray<T> {

    private T[] mas;
    private int size;

    public MyArray(int size){
        mas = (T[]) new Object[size];
    }

    private void test(){
        //T el = new T();
    }

    private static void testStat(){
        // T el;
    }

    public void add(T el){
        if(size == mas.length){
            throw new ArrayStoreException("array is full");
        }
        mas[size++] = el;
    }

    public int size(){
        return size;
    }

    public void set(int index, T el){

    }

    public int indexOf(T el){
        return -1;
    }

}
