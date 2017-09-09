package oop.week2.interf;

public class TestInterf {

    public static void main(String[] args) {
        A a = new Con();
        a.a();

        B b = new Con();
        b.a();
    }

}

interface A{

    void a();

}

interface B {

    void a();

}

class Con implements A, B{

    @Override
    public void a() {

    }
}
