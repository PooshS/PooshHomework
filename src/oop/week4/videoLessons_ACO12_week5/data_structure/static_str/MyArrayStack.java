package oop.week4.videoLessons_ACO12_week5.data_structure.static_str;

import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyIterator;
import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyStack;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayStack<E> implements MyStack<E> {

    private E[] mas;
    private int top;

    public MyArrayStack(int size){
        mas = (E[]) new Object[size];
    }

    @Override
    public void push(E obj) {
        if(top == mas.length){
            System.out.println("Stack is full");
            return;
        }
        mas[top++] = obj;
    }

    @Override
    public E pop() {
        E forRet = mas[--top];
        mas[top] = null;
        return forRet;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayStackIterator<E>(mas, top - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = top - 1; i > 0; i--) {
            sb.append(mas[i]).append("\n");
        }

        return "MyArrayStack{\n" +
                sb +
                '}';
    }

    // nested class, use inner and protected
    private static class MyArrayStackIterator<X> implements Iterator<X>{

        private X[] mas;
        private int current;

        public MyArrayStackIterator(X[] mas, int top) {
            this.mas = mas;
            current = top;
        }

        @Override
        public X next() {
            X last = mas[current];
            current--;
            return last;
        }

        @Override
        public boolean hasNext() {

            return current >= 0;
        }
    }
}
