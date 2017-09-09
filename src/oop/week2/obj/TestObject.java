package oop.week2.obj;

import oop.week2.company.model.Coder;

public class TestObject {

    public static void main(String[] args) {
        Coder coder = new Coder();

        Object obj = coder;

        Object ref2 = new Coder();

        testObj(new TestObject());
    }

    public static void testObj(Object in){
        System.out.println(in.toString());
    }

}
