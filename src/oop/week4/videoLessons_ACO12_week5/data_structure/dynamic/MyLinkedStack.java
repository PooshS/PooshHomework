package oop.week4.videoLessons_ACO12_week5.data_structure.dynamic;


import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyIterator;
import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyStack;

import java.util.Iterator;

public class MyLinkedStack implements MyStack, Iterable {

    private Node top;

    @Override
    public void push(Object obj) {
        if(top == null){
            top = new Node(obj, null);
        }else{
            Node newNode = new Node(obj, top);
            top = newNode;
        }

        // above code (if part) could be replaced by top = new Node(obj, top);
    }

    @Override
    public Object pop() {

        if(top == null){
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public Iterator iterator() {
        return new MyLinkedStackIterator();
    }

    @Override
    public String toString() {
        return "MyLinkedStack{" +
                "top=" + top +
                '}';
    }

    public class MyLinkedStackIterator implements Iterator{

        private Node iter = top;

        @Override
        public Object next() {
            Object ret = iter.val;
            iter = iter.next;
            return ret;
        }

        @Override
        public boolean hasNext() {
            return iter != null;
        }
    }
}
