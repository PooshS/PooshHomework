package oop.week4.videoLessons_ACO12_week5.test_ds;

import oop.week4.videoLessons_ACO12_week5.data_structure.common.MyStack;
import oop.week4.videoLessons_ACO12_week5.data_structure.dynamic.MyLinkedStack;
import oop.week4.videoLessons_ACO12_week5.data_structure.static_str.MyArrayStack;

public class TestStack {

    public static void main(String[] args) {

        MyStack stack = new MyLinkedStack();

        for (int i = 0; i < 7; i++) {
            stack.push(i);
        }

        System.out.println(stack);
    }

}
