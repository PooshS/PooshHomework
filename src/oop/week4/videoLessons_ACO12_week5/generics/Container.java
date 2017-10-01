package oop.week4.videoLessons_ACO12_week5.generics;

public class Container<T> {

    private T el;

    public Container() {
    }

    public Container(T el) {
        this.el = el;
    }

    public T getEl() {
        return el;
    }

    public void setEl(T el) {
        this.el = el;
    }
}
