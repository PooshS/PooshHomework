package oop.week4.videoLessons_ACO12_week5.iterator;

import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyIterator;
import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyStack;
import oop.week4.videoLessons_ACO12_week5.data_structure.dynamic.MyLinkedStack;
import oop.week4.videoLessons_ACO12_week5.data_structure.static_str.MyArrayStack;

import java.util.Iterator;

public class TestMyArrayStackIterator {

    public static void main(String[] args) {
        MyLinkedStack myArrayStack = new MyLinkedStack();
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        myArrayStack.push(4);
        myArrayStack.push(5);

        Iterator iterator = myArrayStack.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("FOR-EACH");
        for(Object el : myArrayStack){
            System.out.println(el);
        }
    }

}
